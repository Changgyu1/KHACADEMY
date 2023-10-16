package com.kh.pattern.mvc.View;

public class StudentView {
	/*
	 * 정보를 화면에 출력
	 */
	public void displayInfo(String studentname, int studentage) {
		System.out.println("- 학생 정보 -");
		System.out.println("이 름 : " + studentname);
		System.out.println("나 이 : " + studentage);
	}
}
