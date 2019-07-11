package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    @Autowired
    private Actor actor;
    private ApplicationContext applicationContext;
    private BeanNameAware beanNameAware;
    private BeanFactoryAware beanFactoryAware;


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display() {
            System.out.println("Actor:"+actor);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println(applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);

    }
}
