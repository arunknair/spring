package com.arun.spring.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collegeConfig.xml");
		Student s1 = context.getBean("stdnt",Student.class);
		s1.dispCourseDetails();
	}
}
