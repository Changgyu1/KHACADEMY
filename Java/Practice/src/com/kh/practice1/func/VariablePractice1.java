package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		int age;
		float key;
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("������ �Է��ϼ��� : ");
		gender = sc.next();
		System.out.println("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ��� : ");
		key = sc.nextFloat();
		
		System.out.println("Ű " + key + "cm�� " + age + "�� " + gender + " " + name + "�� �ݰ����ϴ�.");
		
		
		
	}

}
