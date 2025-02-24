package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class MyConfiguration {
	@Bean
	public Student s1() {
		return new Student(24,"Pavan","pavan@gmail.com");
	}
	@Bean
	public Student s2() {
		return new Student(49,"Nagasai","nagasai@gmail.com");
	}
	@Bean
	public College c1() {
		College c = new College();
		c.setName("BITS");
		c.setId(3);
		c.setLocation("Wrgl");
		return c;
		
	}

}
