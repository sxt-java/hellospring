package com.fix.spring.mvctest.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fix.spring.entity.Student;
import com.fix.spring.mvctest.dao.IStudentDao;

@Service("stuService")
public class StudentServiceImpl implements IStudentService {
	
	Logger log= Logger.getLogger(StudentServiceImpl.class);
		
	@Resource(name="studentDao")
	IStudentDao studentDao;
	
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void addStudent(Student st) {
		//System.out.println("注册成功"); // debug ,info
		log.info("-------注册成功------");
		 
		studentDao.insertStudent(st);	
//		int n=10/0;
	}
	
	public void delStudent(int uid){
		System.out.println("删除成功");
	}
 
}
