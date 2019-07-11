package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        movie.display();
        context.close();

    }
}
