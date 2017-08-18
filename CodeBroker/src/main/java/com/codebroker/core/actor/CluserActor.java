package com.codebroker.core.actor;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.codebroker.core.ContextResolver;
import com.codebroker.core.ServerEngine;
import com.codebroker.core.actor.ServerCluserActorProxy.State;
import com.codebroker.core.eventbus.CluserEnvelope;
import com.codebroker.core.eventbus.CodebrokerEnvelope.MsgEnvelope;
import com.codebroker.util.AkkaMediator;
import com.google.common.collect.Queues;
import com.message.thrift.actor.CluserHelloMessage;
import com.message.thrift.actor.CluserInitMessage;
import com.message.thrift.actor.CluserReciveMessage;
import com.message.thrift.actor.CluserSendMessage;
import com.message.thrift.actor.Handshake;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Address;
import akka.japi.pf.ReceiveBuilder;

/**
 * 集群的Actor事件处理
 * 
 * @author zero
 *
 */
public class CluserActor extends AbstractActor {

	/** 1560657262 */
	public long uid;
	/** 192.168.0.127 */
	public String host;
	/** CodeBroker@192.168.0.127:2551 */
	public String hostPort;
	/** 2251 */
	public Integer port;

	/** CodeBroker */
	public String system;
	/** akka.tcp */
	public String protocol;

	private List<ServerCluserActorProxy> list = new ArrayList<ServerCluserActorProxy>();

	@Override
	public Receive createReceive() {
		return ReceiveBuilder.create().match(CluserInitMessage.class, msg -> {
			cluserRegedit(msg);
		}).match(CluserHelloMessage.class, msg -> {
			handshake(msg);
		}).match(CluserSendMessage.class, msg -> {
			sendMessage(msg);
		}).match(CluserReciveMessage.class, msg -> {
			reciveCluserMessage(msg);
		}).build();
	}

	private void reciveCluserMessage(CluserReciveMessage msg) {
		ActorSelection systemActorSelection = AkkaMediator.getSystemActorSelection(msg.actorPath);
		systemActorSelection.tell(msg, getSender());
	}

	private void sendMessage(CluserSendMessage msg) {
		for (ServerCluserActorProxy serverCluserActorProxy : list) {
			if (serverCluserActorProxy.getServerId() == msg.serverId) {
				// 目标Actor Path,命令,命令元数据
				CluserReciveMessage message = new CluserReciveMessage(msg.actorPath, msg.cmd, msg.messageRaw);
				serverCluserActorProxy.sendMessage(message, getSelf());
			}
		}
	}

	/**
	 * 处理握手函数
	 * 
	 * @param msg
	 */
	private void handshake(CluserHelloMessage msg) {
		if (msg.state.equals(Handshake.SEND)) {
			// **收到握手信息
			for (ServerCluserActorProxy serverCluserActorProxy : list) {
				// 找到对应的服务器，设置服务器ID
				if (serverCluserActorProxy.uid == msg.uid) {
					serverCluserActorProxy.setActorRef(getSender());
					if (serverCluserActorProxy.getState().equals(State.LOST)) {
						serverCluserActorProxy.sendHasMessage(getSelf());
						serverCluserActorProxy.setState(State.READY);
					} else {
						serverCluserActorProxy.setServerId(msg.serverId);
					}
				}
			}
		} else if (msg.state.equals(Handshake.BACK)) {
			boolean has = false;
			for (ServerCluserActorProxy serverCluserActorProxy : list) {
				// 找到对应的服务器，设置服务器ID
				if (serverCluserActorProxy.uid == msg.uid) {
					serverCluserActorProxy.setActorRef(getSender());
					serverCluserActorProxy.setState(State.READY);
					has = true;
				}
			}
			if (!has) {
				ServerCluserActorProxy serverCluserActorProxy = new ServerCluserActorProxy(msg.uid, msg.serverId);
				list.add(serverCluserActorProxy);
			}
		} else {

		}
	}

	/**
	 * 注册一个集群节点
	 * 
	 * @param msg
	 */
	private void cluserRegedit(CluserInitMessage msg) {
		// 如果是本机的话
		if (getSender().equals(getSelf())) {
			this.uid = msg.longUid;
			this.host = msg.host;
			this.hostPort = msg.hostPort;
			this.port = msg.port;
			this.system = msg.system;
			this.protocol = msg.protocol;
		} else {
			ServerCluserActorProxy cluserActorProxy;
			boolean has = false;
			for (ServerCluserActorProxy serverCluserActorProxy : list) {
				if (serverCluserActorProxy.uid == msg.longUid) {
					cluserActorProxy = serverCluserActorProxy;
					cluserActorProxy.host = msg.host;
					cluserActorProxy.hostPort = msg.hostPort;
					cluserActorProxy.port = msg.port;
					cluserActorProxy.system = msg.system;
					cluserActorProxy.protocol = msg.protocol;
					has = true;
				}
			}
			if (!has) {
				cluserActorProxy = new ServerCluserActorProxy(msg.longUid, msg.host, msg.hostPort, msg.port, msg.system,
						msg.protocol);
				list.add(cluserActorProxy);
			}
			// 不是本机的处理

			CluserHelloMessage cluserHelloMessage = new CluserHelloMessage(ServerEngine.serverId, uid, Handshake.SEND);

			Address addr = new Address(msg.protocol, msg.system, msg.host, msg.port);
			ActorSystem actorSystem = ContextResolver.getActorSystem();
			// 跟对方服务器握手
			ActorSelection actorSelection = actorSystem.actorSelection(addr + "/user/ClusterListener/CluserActor");
			actorSelection.tell(cluserHelloMessage, getSelf());
		}
	}

}

/**
 * 代理服务器对象
 * 
 * @author zero
 *
 */
class ServerCluserActorProxy {
	/** 1560657262 */
	public long uid;
	/** 192.168.0.127 */
	public String host;
	/** CodeBroker@192.168.0.127:2551 */
	public String hostPort;
	/** 2251 */
	public Integer port;

	/** CodeBroker */
	public String system;
	/** akka.tcp */
	public String protocol;

	private int serverId;
	private ActorRef actorRef;
	private State state;
	private Queue<CluserReciveMessage> waitSend = Queues.newLinkedBlockingDeque();

	enum State {
		WAIT, READY, LOST;
	}

	public ServerCluserActorProxy(long uid, String host, String hostPort, Integer port, String system,
			String protocol) {
		super();
		this.uid = uid;
		this.host = host;
		this.hostPort = hostPort;
		this.port = port;
		this.system = system;
		this.protocol = protocol;
		this.state = State.WAIT;
	}

	public ServerCluserActorProxy(long uid, int serverId) {
		super();
		this.uid = uid;
		this.serverId = serverId;
		this.state = State.WAIT;
	}

	public void sendHasMessage(ActorRef self) {
		while (!waitSend.isEmpty()) {
			CluserReciveMessage poll = waitSend.poll();
			actorRef.tell(poll, self);
		}

	}

	public void sendMessage(CluserReciveMessage message, ActorRef sender) {
		if (state.equals(State.READY)) {
			actorRef.tell(message, sender);
		} else {
			waitSend.add(message);
		}
	}

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	public ActorRef getActorRef() {
		return actorRef;
	}

	public void setActorRef(ActorRef actorRef) {
		this.actorRef = actorRef;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}