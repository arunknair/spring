package com.arun.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
//		using Bean Factory
		
//		Resource resource = new ClassPathResource("employeeBean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Employee e1 = (Employee)factory.getBean("emp1");
//		Employee e2 = factory.getBean("emp2", Employee.class);
		
//		System.out.println("E1 : " + e1.toString());
//		System.out.println("E2 : " + e2.toString());
		
		
//		using Application Context
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
