package com.springconstructorconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
        Parent parent = context.getBean("parent1",Parent.class);
        System.out.println(parent);
        
    }
}
