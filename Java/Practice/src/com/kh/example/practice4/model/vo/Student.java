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
		this.name = "��â��";
		this.height = 120.7;
		this.gender = '��';
	}

	public void information() {
		System.out.println(grade + "�г� " + classroom + "�� " + gender + "�л� " + name + "���� Ű�� " + height + "cm �Դϴ� ");
	}
}
