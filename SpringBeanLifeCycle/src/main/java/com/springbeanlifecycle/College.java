package com.springbeanlifecycle;

public class College {
	String name;
	String location;
	Student student;
	public College(String name, String location, Student student) {
		super();
		this.name = name;
		this.location = location;
		this.student = student;
	}
	public College() {
		System.out.println("College bean created...");
	}
	public void init() {
		System.out.println("In init() method");
		
	}
	public void des() {
		System.out.println("In destroy method");
		
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + ", student=" + student + "]";
	}
}
