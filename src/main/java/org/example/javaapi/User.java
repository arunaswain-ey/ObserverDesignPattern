package org.example.javaapi;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hello " + name + ", " + ((Website) o).getName() + " published new content : " + arg);
    }
}
