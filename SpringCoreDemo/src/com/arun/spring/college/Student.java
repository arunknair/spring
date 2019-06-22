package com.arun.spring.college;

public class Student {

	private String name;
	private String age;
	private int id;
	private ICourse course;
	
	
	public void setCourse(ICourse course) {
		this.course = course;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void dispCourseDetails() {
		this.course.printSubject();
	}
}
