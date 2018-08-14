package com.fix.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fix.spring.entity.Printer;
import com.fix.spring.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 原来
    	Student st= new Student("TEMO",10);
    	st.sayHello();
    	
    	//现在
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Student st1= (Student)context.getBean("stu");
    	Student st2= (Student)context.getBean("stu");  // 默认singleton
    	
    	st1.sayHello();
    	System.out.println(st1.getFamilies());
    	System.out.println(st1.getHobby());
    	System.out.println(st1.getEducation());
    	
    	System.out.println("相同吗？ ---"+ (st1==st2));
    	
    	//组装打印机
    	//Printer hp = (Printer)context.getBean("hp");
    	//hp.print();
    }
}
