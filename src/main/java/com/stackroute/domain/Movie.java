package com.stackroute.domain;

public class Movie {
    Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display() {
            System.out.println("Actor:"+actor);

    }
}
