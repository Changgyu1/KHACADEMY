package com.kh.hw.person.model.vo;

import java.util.Scanner;

public class Student extends Person{
	private int grade;  // 학년
	private String major; // 전공

	

	
	public Student() {

	}
	
	//name:String, age:int, height:double, weight:double, grade:int, major:String)
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, weight, height);
		this.grade = grade;
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
