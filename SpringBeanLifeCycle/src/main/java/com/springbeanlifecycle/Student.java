package com.springbeanlifecycle;

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
	public Student() {
		System.out.println("Student bean created...");
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + "]";
	}
}
