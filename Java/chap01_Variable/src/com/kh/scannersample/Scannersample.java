package com.kh.scannersample;

import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��� �ּ���. : ");
		int age = sc.nextInt(); // ������ �޴� next
		System.out.println("�� ���̴� " + age + "�� �Դϴ�." );
		
		String name;
		int phoneNumber;  // �������̶� ù��°�� 0�̸� ����� 
		
		System.out.println("����� �̸��� �Է��ϼ���. : ");
		name = sc.next();
		System.out.println("����� ��ȣ�� �Է����ּ���. : ");
		phoneNumber = sc.nextInt();  // - < ���� �ʱ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + " �Դϴ�." );
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� ����ϱ�
		String hobby, food, address;
		
		System.out.println("����� ��̴� : ");
		hobby = sc.next();
		System.out.println("���� ��̴� " + hobby + " �Դϴ�.");
		
		System.out.println("����� �����ϴ� ������ : ");
		food = sc.next();
		System.out.println("���� �����ϴ� ������ " + food + " �Դϴ�.");
		
		System.out.print("����� �ּҴ� : ");
		address = sc.next();
		System.out.println("���� �ּҴ� " + address + " �Դϴ�.");
	}
}
