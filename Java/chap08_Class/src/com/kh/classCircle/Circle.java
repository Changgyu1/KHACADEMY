package com.kh.classCircle;

public class Circle {
	// �������
	// private double PI = 3.14;
	// pirvate final double PI = 3.14;
	// pirvate static final double PI = 3.14;
	private final double PI = 3.14;  // ���
	private int radius = 1; // ����
	
	// ������
	public Circle() {
		// �⺻������
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	// �޼ҵ�
	// �������� ���� ���
	public void increamentRadius() {
		// ������ ���� : ������ų ���� ������ �� �ִ�!
		radius++;
	}
	
	public void AreaCircle() {
	// ���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	double area = PI * radius * radius;
	System.out.println("���� ���� : " + area);
	}
	
	public void SizeOfCircle() {
		System.out.println("���� ũ��(������) : " + radius);
	}
}
