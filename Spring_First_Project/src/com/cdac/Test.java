package com.cdac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	//Student student=(Student)context.getBean("studentbean");//i m not creating the object. but just accessing the object which is created by ioc conteainer
	//student.displayInfo();
	
	
	/*Employee s1=(Employee)context.getBean("e1");
	s1.displayInfo();
	System.out.println("--------------------------------------");
	Employee s2=(Employee)context.getBean("e2");
	s2.displayInfo();
	
	System.out.println("--------------------------------------");
	Employee s3=(Employee)context.getBean("e3");
	s3.displayInfo();
	
	Address a1=(Address)context.getBean("a");
	System.out.println(a1);*/
	
	System.out.println("--------------------------------------");
	
	Employee e4=(Employee)context.getBean("e4");
	e4.displayInfo();
	

	
}
}
