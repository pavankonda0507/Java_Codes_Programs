package com.javaconfig;

public class Student {
	int roll;
	String name;
	String email;
	public Student(int roll, String name, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + "]";
	}
}
