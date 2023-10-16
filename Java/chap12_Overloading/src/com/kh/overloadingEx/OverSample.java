package com.kh.overloadingEx;

public class OverSample {

	// 2���� ����
	public int sum(int a, int b) {
		return a + b;
	}

	// 3���� ����
	public int sum(int a, int b, int c) {
		return a * b * c;
	}

	// a*b + c*d ���ϰ� ���ϱ�
	public int sum(int a, int b, int c, int d) {
		return (a * b) + (c * d);
	}

	// �Ǽ� 2�� ���ϱ�
	public double sum(double a, double b) {
		return a * b;
	}

	// �Ǽ� ���ϰ� ������
	public double sum(double a, double b, double c) {
		return a * b / c;
	}

	public static void main(String[] args) {

		OverSample ob = new OverSample();

		System.out.println("�� ���� ���� ���� : " + ob.sum(10, 7));
		System.out.println("�� ���� ���� ���� : " + ob.sum(10, 7, 2));
		System.out.println("(�ΰ���) (/) (�ΰ���) ���� : " + ob.sum(10, 7, 5, 4));
		System.out.println("�� ���� �Ǽ� ���� : " + ob.sum(10.27, 7.3));
		System.out.println("�� ���� �Ǽ� ���ϰ� ������ : " + ob.sum(10.4, 7.25, 5.17));

	}

}
