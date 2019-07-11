package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display() {
            System.out.println("Actor:"+actor);

    }
}
