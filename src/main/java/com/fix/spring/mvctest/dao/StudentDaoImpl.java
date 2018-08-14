package com.fix.spring.mvctest.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fix.spring.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {

	@Override
	public void insertStudent(Student st) {
		System.out.println("增加学生成功");
	}

}
