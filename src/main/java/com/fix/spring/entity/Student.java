package com.fix.spring.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String stuName;
    private int stuAge;
    private List<String> families;
    private Set<String> hobby;
    private Map<String, String> education;
    private Properties score;
    
    public Student() {
		
	}

	public Student(String stuName, int stuAge) {
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	
	public void sayHello(){
		System.out.println("大家好，我名叫："+stuName+",我的年龄是："+stuAge);
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public List<String> getFamilies() {
		return families;
	}

	public void setFamilies(List<String> families) {
		this.families = families;
	}

	public Set<String> getHobby() {
		return hobby;
	}

	public void setHobby(Set<String> hobby) {
		this.hobby = hobby;
	}

	public Map<String, String> getEducation() {
		return education;
	}

	public void setEducation(Map<String, String> education) {
		this.education = education;
	}

	public Properties getScore() {
		return score;
	}

	public void setScore(Properties score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
	
 
    
}