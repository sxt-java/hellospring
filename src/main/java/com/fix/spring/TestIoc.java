package com.fix.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fix.spring.mvctest.service.IStudentService;

public class TestIoc {
	
	public static void main(String[] args) {
		//现在
    	ApplicationContext context = new ClassPathXmlApplicationContext("ioctest.xml");
		
		IStudentService service = (IStudentService)context.getBean("studentService");
		service.addStudent(null);
	}

}
