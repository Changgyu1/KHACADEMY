package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] star = new Student[5];
	private final int  CUT_LINE  = 60;
	public int getCUT_LINE () {
		return  CUT_LINE ;
	}

	public StudentController() {
		star[0] = new Student("��浿", "�ڹ�", 100);
		star[1] = new Student("�ڱ浿", "���", 50);
		star[2] = new Student("�̱浿", "ȭ��", 85);
		star[3] = new Student("���浿", "����", 60);
		star[4] = new Student("ȫ�浿", "�ڹ�", 20);
	}
	
	public Student[] printStudent() {
		return star;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int a = 0; a < star.length; a++) {
			sum += star[a].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] dtar = new double[2];
		dtar[0] = sumScore();
		dtar[1] = sumScore() / star.length;
		return dtar;
	}

		
		
		

}
