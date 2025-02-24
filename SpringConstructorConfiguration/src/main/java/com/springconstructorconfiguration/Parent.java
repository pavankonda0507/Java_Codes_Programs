package com.springconstructorconfiguration;

public class Parent {
	String name;
	int age;
	Student student;
	public Parent(String name, int age, Student student) {
		super();
		this.name = name;
		this.age = age;
		this.student = student;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + ", student=" + student + "]";
	}
	

}
