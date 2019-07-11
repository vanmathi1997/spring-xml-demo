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
        System.out.println("Success");
        Movie movie=context.getBean("movie",Movie.class);
       movie.display();
        Resource res= new ClassPathResource("beans.xml");
        BeanFactory factory=new XmlBeanFactory(res);
        Movie movie1=factory.getBean("movie",Movie.class);
        movie1.display();

    }
}
