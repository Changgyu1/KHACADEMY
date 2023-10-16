package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] star = new Student[5];
	private final int  CUT_LINE  = 60;
	public int getCUT_LINE () {
		return  CUT_LINE ;
	}

	public StudentController() {
		star[0] = new Student("김길동", "자바", 100);
		star[1] = new Student("박길동", "디비", 50);
		star[2] = new Student("이길동", "화면", 85);
		star[3] = new Student("정길동", "서버", 60);
		star[4] = new Student("홍길동", "자바", 20);
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
