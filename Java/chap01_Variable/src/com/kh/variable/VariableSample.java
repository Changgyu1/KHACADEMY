package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "����";

		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("�ȳ��ϼ���. " + name + "�Դϴ�. ���� " + hour + "�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score + "�Դϴ�.");
		System.out.println(score + "���� " + grade + "�Դϴ�.");

		// ������ �̸��� ���̿� �ڽ��� ���� (double)�� �ֱ�.
		String name1;
		name1 = "��â��";
		int age = 25;
		double sco = 87.2;
		char gad = 'B';
		System.out.print("�ȳ��ϼ���. ���� �̸��� " + name1 + "�Դϴ�. ���� ���̴� " + age + "�̰�, ");
		System.out.print("���� ������ " + sco + "������ " + gad + "��� �Դϴ�.");
	}

}
