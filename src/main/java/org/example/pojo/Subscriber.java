package org.example.pojo;

import lombok.Data;

@Data
public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void notifySubscriber(String title) {
        System.out.println("Hello " + name + ", new video uploaded by " + channel + " : " + title);
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
        channel.addSubscriber(this);
    }

    public void unSubscribeChannel(Channel channel) {
        this.channel = null;
        channel.unsubscribe(this);
    }
}
