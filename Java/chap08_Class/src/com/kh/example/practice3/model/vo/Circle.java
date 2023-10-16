package com.kh.example.practice3.model.vo;

public class Circle {
	//필드(멤버변수)
	double Pl = 3.14; //원주율
	int radius = 1;  // 반지름
	
	public Circle() {
		//기본 생성자, 아무런 초기화도 해주지 않는다
		//생성자
	}
	//메소드
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() { 
		double area = Pl * radius * radius;
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : " + radius);
	}
}
