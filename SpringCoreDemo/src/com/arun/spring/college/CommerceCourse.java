package com.arun.spring.college;

public class CommerceCourse implements ICourse{

	private int courseId;
	
	public void printSubject() {
		System.out.println(" CommerceCourse Subjects : Accountancy, Statistics, Comp Sc, Maths");
	}
}
