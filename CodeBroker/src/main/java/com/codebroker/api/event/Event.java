package com.codebroker.api.event;

import com.codebroker.core.data.IObject;

public class Event {

    private String topic;
    private IObject message;

    public Event() {
        super();
    }

    public Event(String topic, IObject message) {
        super();
        this.topic = topic;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public IObject getMessage() {
        return message;
    }

    public void setMessage(IObject message) {
        this.message = message;
    }


}
