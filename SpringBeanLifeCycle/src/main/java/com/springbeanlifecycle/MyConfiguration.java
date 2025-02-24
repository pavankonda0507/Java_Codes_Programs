package com.springbeanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfiguration {
	@Bean
	public Student s1() {
		return new Student();
		
	}
	@Bean
	public College c1() {
		return new College();
	}
	
	
	

}
