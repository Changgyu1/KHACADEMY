package com.kh.example.practice3.model.vo;

public class Circle {
	//�ʵ�(�������)
	double Pl = 3.14; //������
	int radius = 1;  // ������
	
	public Circle() {
		//�⺻ ������, �ƹ��� �ʱ�ȭ�� ������ �ʴ´�
		//������
	}
	//�޼ҵ�
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() { 
		double area = Pl * radius * radius;
	}
	
	public void getSizeOfCircle() {
		System.out.println("���� ������ : " + radius);
	}
}
