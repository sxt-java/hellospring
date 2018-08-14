package com.fix.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fix.spring.mvctest.dao.IStudentDao;
import com.fix.spring.mvctest.service.IStudentService;

public class AnnotationTest {

	public static void main(String[] args) {
		// 注解测试		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		IStudentService service =  (IStudentService)context.getBean("stuService");
		service.addStudent(null);
	}

}
