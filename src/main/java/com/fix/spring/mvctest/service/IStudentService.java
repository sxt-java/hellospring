package com.fix.spring.mvctest.service;

import com.fix.spring.entity.Student;

public interface IStudentService {
	
	//注册学生
	void addStudent(Student st);
	
	void delStudent(int uid);

}
