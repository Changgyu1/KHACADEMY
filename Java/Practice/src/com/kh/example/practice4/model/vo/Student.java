package com.kh.example.practice4.model.vo;

public class Student {
	int grade;
	int classroom;
	String name;
	double height;
	char gender;

	public Student() {
		this.grade = 1;
		this.classroom = 7;
		this.name = "박창규";
		this.height = 120.7;
		this.gender = '남';
	}

	public void information() {
		System.out.println(grade + "학년 " + classroom + "반 " + gender + "학생 " + name + "님의 키는 " + height + "cm 입니다 ");
	}
}
