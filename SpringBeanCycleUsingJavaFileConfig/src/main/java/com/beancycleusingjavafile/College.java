package com.beancycleusingjavafile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class College {
	String name;
	int id;
	Student student;
	public College() {
		System.out.println("College object created...");
	}
	@PostConstruct	
	public void init() {
		System.out.println("In init() method... ");
	}
	@PreDestroy
	public void des() {
		System.out.println("In destroy() method...");
	}
	public College(String name, int id, Student student) {
		super();
		this.name = name;
		this.id = id;
		this.student = student;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", id=" + id + ", student=" + student + "]";
	}
	

}
