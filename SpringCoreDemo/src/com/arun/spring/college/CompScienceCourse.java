package com.arun.spring.college;

public class CompScienceCourse implements ICourse{

	private int courseId;
	
	public void printSubject() {
		System.out.println("CompScienceCourse Subjects : Comp Sc, Maths, Chem, Phy");
	}
}
