package com.arun.spring.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMobile {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		Sim sim = context.getBean("sim",Sim.class);
		sim.browsing();
		sim.calling();
	}
}
