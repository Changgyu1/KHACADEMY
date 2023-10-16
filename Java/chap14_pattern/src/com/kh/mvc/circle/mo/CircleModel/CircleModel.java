package com.kh.mvc.circle.mo.CircleModel;

public class CircleModel {
	/*
	 * 1. 학생 정보 표현 private 이름 나임 getter setter 만들기
	 */
	private int number;
	private double PI;

	public void setNumber(int number) {
		this.number = number;
	}

	public void setPI(double PI) {
		this.PI = PI;
	}

	public double getPI() {
		return PI;
	}

	public int getNumber() {
		return number;
	}

	public CircleModel(int number, double PI) {
		this.number = number;
		this.PI = PI;
	}
}