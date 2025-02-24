package com.springstudentteacherapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
        College college = context.getBean("college1",College.class);
        System.out.println(college);
    }
}