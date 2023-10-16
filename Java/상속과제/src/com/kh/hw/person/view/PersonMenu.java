package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		/*
		�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.
		���� ����� �л��� M���Դϴ�.
		����� �ִ� 10����� ������ �� �ֽ��ϴ�.
		���� ����� ����� N���Դϴ�.
		M�� N�� ���� ���ڴ� PersonControoler(pc)Ŭ������ �ִ�
		personCount() �޼ҵ��� ��ȯ ���� �̿��Ͽ� ���
		*/
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + "M");
		System.out.println("����� �ִ� "+ "N" + "����� ������ �� �ֽ��ϴ�.");
		
		System.out.println("1.�л� �޴�");
		System.out.println("2.��� �޴�");
		System.out.println("9.������");
		System.out.println("�޴� ��ȣ : ");
		int select = sc.nextInt();
		
			switch(select) {
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
					break;
				case 9:
					System.out.println("�����մϴ�!");
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ��Է����ּ���!");
			}
	}
	
	
	
	
	public void studentMenu() {
		System.out.println("1.�л� �߰�");
		System.out.println("2.�л� ����");
		System.out.println("9.��������");
		System.out.println("");
		System.out.println("�޴� ��ȣ : ");
		int select = sc.nextInt();

		switch(select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���!");
		}
	}
	
	public void employeeMenu() {
		System.out.println("1.��� �߰�");
		System.out.println("2.��� ����");
		System.out.println("9.��������");
		System.out.println("");
		System.out.println("�޴� ��ȣ : ");
		int select = sc.nextInt();

		switch(select) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���!");
		}
		
	}
	
	public void insertStudent() {
		System.out.println("�л� �̸� : ");
		String name = sc.next();
		System.out.println("�л� ���� : ");
		int age = sc.nextInt();
		System.out.println("�л� Ű : ");
		double height = sc.nextDouble();
		System.out.println("�л� ������ : ");
		double weight = sc.nextDouble();
		System.out.println("�л� �г� : ");
		int grade = sc.nextInt();
		System.out.println("�л� ���� : ");
		String major = sc.next();

	}
	
	public void printStudent() {}
	
	public void insertEmployee() {
		System.out.println("��� �̸� : ");
		String name = sc.next();
		System.out.println("��� ���� : ");
		int age = sc.nextInt();
		System.out.println("��� Ű : ");
		double height = sc.nextDouble();
		System.out.println("��� ������ : ");
		double weight = sc.nextDouble();
		System.out.println("��� �޿� : ");
		int grade = sc.nextInt();
		System.out.println("��� �μ� : ");
		String major = sc.next();
	}
	
	public void printEmployee() {}
	
	
	
/*


+mainMenu():void
���� �޴��� ����ϴ� �޼ҵ�
+studentMenu():void
�л� �޴��� ����ϴ� �޼ҵ�
+employeeMenu():void
��� �޴��� ����ϴ� �޼ҵ�
+insertStudent():void
����ڿ��� ��ü�迭�� ������ �л� �����͸� �޴� �޼ҵ�
+printStudent():void
��ü�迭�� ����� �л� �����͸� ����ϴ� �޼ҵ�
+insertEmployee():void
����ڿ��� ��ü�迭�� ������ ��� �����͸� �޴� �޼ҵ�
+printEmployee():void
��ü�迭�� ����� ��� �����͸� ����ϴ� �޼ҵ�

*/
}
