package com.springapplication;

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
//        Employee emp = context.getBean("emoloyee1",Employee.class);
//        System.out.println(emp);
    }
}
