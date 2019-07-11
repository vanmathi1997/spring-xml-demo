package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie1",Movie.class);
        Movie movie1ref=context.getBean("movie1",Movie.class);
       movie1.display();
       Movie movie2=context.getBean("movie2",Movie.class);
        Movie movie2ref=context.getBean("movie2",Movie.class);
        movie2.display();
        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.display();
        System.out.println("Singleton scope for movie1 "+ (movie1==movie1ref));
        System.out.println("Prototype scope for movie2 "+ (movie2==movie2ref));

    }
}
