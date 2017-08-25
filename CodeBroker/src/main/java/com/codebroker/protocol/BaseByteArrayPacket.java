package com.codebroker.protocol;

import com.codebroker.api.internal.ByteArrayPacket;

public class BaseByteArrayPacket implements ByteArrayPacket {

	protected int opcode;

	protected byte[] RawData;

	public BaseByteArrayPacket(int opcode, byte[] rawData) {
		super();
		this.opcode = opcode;
		RawData = rawData;
	}

	public BaseByteArrayPacket() {
		super();
	}

	@Override
	public int getOpCode() {
		return opcode;
	}

	@Override
	public byte[] getRawData() {
		return RawData;
	}

	@Override
	public byte[] toBinary() {
		byte[] result=new byte[4+RawData.length];
		byte[] intToByteArray = intToByteArray(opcode);
		System.arraycopy(intToByteArray, 0,result , 0, intToByteArray.length);
		System.arraycopy(RawData, 0,result , intToByteArray.length, RawData.length);
		return result;
	}
	
	
	@Override
	public void fromBinary(byte[] binary) {
		//长度不够，不用解析了，解析也报错
		if (binary.length<4) {
			return;
		}
		byte[] opcodeByte=new byte[4]; 
		byte[] rawByte=new byte[binary.length-4]; 
		
		System.arraycopy(binary, 0,opcodeByte , 0, opcodeByte.length);
		this.opcode=byteArrayToInt(opcodeByte);
		System.arraycopy(binary, 4,rawByte , 0, rawByte.length);
		this.RawData=rawByte;
	}
	
	public  int byteArrayToInt(byte[] b) {
		return b[3] & 0xFF | (b[2] & 0xFF) << 8 | (b[1] & 0xFF) << 16 | (b[0] & 0xFF) << 24;
	}

	public  byte[] intToByteArray(int a) {
		return new byte[] { (byte) ((a >> 24) & 0xFF), (byte) ((a >> 16) & 0xFF), (byte) ((a >> 8) & 0xFF),
				(byte) (a & 0xFF) };
	}
}