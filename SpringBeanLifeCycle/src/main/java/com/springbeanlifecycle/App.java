package com.springbeanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Before bean created...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
        System.out.println(context.getBean(College.class));
        context.registerShutdownHook();
    }
}
