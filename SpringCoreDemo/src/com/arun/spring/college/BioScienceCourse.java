package com.arun.spring.college;

public class BioScienceCourse implements ICourse{

	private int courseId;
	
	public void printSubject() {
		System.out.println(" BioScienceCourse Subjects : Bio, Maths, Chem, Phy");
	}
}
