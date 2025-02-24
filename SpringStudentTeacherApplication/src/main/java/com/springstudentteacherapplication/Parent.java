package com.springstudentteacherapplication;

public class Parent {
	String name;
	String occupation;
	Student student;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", occupation=" + occupation + ", student=" + student + "]";
	}
	

}
