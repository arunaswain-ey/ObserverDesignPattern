package org.example.javaapi;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@Data
public class Website extends Observable {
    private String name;
    private List<String> blogs = new ArrayList<>();

    public Website(String name) {
        this.name = name;
    }

    public void publishNewBlog(String title) {
        blogs.add(title);
        setChanged();
        notifyObservers(title);
    }
}
