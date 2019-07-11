package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //Singleton movie1
        Movie movie1=context.getBean("movie1",Movie.class);
        Movie movie1ref=context.getBean("movie1",Movie.class);
       movie1.display();
       //prototype movie2
       Movie movie2=context.getBean("movie2",Movie.class);
        Movie movie2ref=context.getBean("movie2",Movie.class);
        movie2.display();

        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.display();
        //Rename <bean name="movieA,movieB"...>
        Movie moviename=context.getBean("movieA",Movie.class);
        Movie movienameref=context.getBean("movieB",Movie.class);
        System.out.println("Singleton scope for movie1 "+ (movie1==movie1ref));
        System.out.println("Prototype scope for movie2 "+ (movie2==movie2ref));
        System.out.println("Replace id with name for two movies "+(moviename==movienameref));

    }
}
