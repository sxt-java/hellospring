package com.fix.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fix.spring.entity.Student;
import com.fix.spring.mvctest.service.IStudentService;

public class TestAspect2 {

	public static void main(String[] args) {
		
		//现在
    	ApplicationContext context = new ClassPathXmlApplicationContext("aspect2.xml");
		
		IStudentService service = (IStudentService)context.getBean("stuService");
		service.addStudent(new Student("张三丰",90));
		//service.delStudent(1);
	}

}
