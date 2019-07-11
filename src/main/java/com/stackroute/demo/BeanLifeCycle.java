package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroying the bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");
    }
    public void customdestroy()
    {
        System.out.println("Destroy");
    }
    void  custominit()
    {
        System.out.println("Initialization");
    }
}
