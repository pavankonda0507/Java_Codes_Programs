package com.beancycleusingjavafile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
