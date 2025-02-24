package com.springapplication;

public class Employee {
	int id;
	String name;
	String company;
	
	public Employee() {
		System.out.println("Hello all");
	}
	public Employee(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
}
