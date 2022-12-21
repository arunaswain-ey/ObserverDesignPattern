package org.example.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Channel {
    private String name;
    private List<String> videos = new ArrayList<>();
    private List<Subscriber> subscriberList = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println("new subscriber added -" + subscriber.getName());
    }

    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println("User un-subscribed -" + subscriber.getName());
    }

    public void uploadNewVideo(String title) {
        subscriberList.forEach(subscriber -> notifySubscriber(title, subscriber));
    }

    private void notifySubscriber(String title, Subscriber subscriber) {
        System.out.println("Hello " + subscriber.getName() + ", new video uploaded by " + name + " : " + title);
    }

}
