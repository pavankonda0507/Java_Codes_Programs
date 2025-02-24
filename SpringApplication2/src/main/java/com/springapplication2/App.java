package com.springapplication2;

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
    	College col = context.getBean("college1",College.class);
    	System.out.println(col);
    }
}
