package org.example.javaapi;



public class Main {
    public static void main(String[] args) {
        System.out.println("Observer DP - java library!");
        Website website = new Website("TED");

        User subscriber1 = new User("Aruna");
        User subscriber2 = new User("Prakash");

        website.addObserver(subscriber1);
        website.addObserver(subscriber2);

        website.deleteObserver(subscriber1);

        website.publishNewBlog("How to design API!");
    }
}