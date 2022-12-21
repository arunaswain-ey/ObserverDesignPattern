package org.example.pojo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer DP using POJO!");
        Channel channel = new Channel("TED");

        Subscriber subscriber1 = new Subscriber("Aruna");
        Subscriber subscriber2 = new Subscriber("Prakash");
        subscriber1.subscribeChannel(channel);
        subscriber2.subscribeChannel(channel);

        subscriber1.unSubscribeChannel(channel);

        channel.uploadNewVideo("How to design API!");
    }
}