package com.kh.switchsample;

import java.util.Scanner;

public class SwithchScanner {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. ���ν����");
		System.out.println("4. ������Ƽ");
		System.out.print("�ֹ� ��ȣ : ");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("ī��� �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("������Ƽ �ֹ��ϼ̽��ϴ�.");
				break;
			default :
				System.out.println("�߸��� �ֹ� ��ȣ�Դϴ�. �ٽ� �������ּ���!");
				System.out.println("1�� 2�� 3�� 4�� �� �ϳ��� ����ּ���!");	
		}
		Scanner sv = new Scanner(System.in);
		System.out.println("������ �������ּ���.");
		int fruit = sv.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��");
		}
	*/
		//scanner �� �̿��ؼ� ���ڸ� �����ϴ� switch �� �ϳ� ������ּ���.
		Scanner so = new Scanner(System.in);
		
		boolean isChoice = false; // while �� false �� �� ������ ���� , true �� �� ����
			
		while (!isChoice) { // �ʱ� ���°� false while�� ���� �� ����
			int snack;
			System.out.println("���ڸ� �������ּ���!");
			snack = so.nextInt();
			switch (snack) {
				case 1:
					System.out.println("������");
					isChoice = true;
					break;
				case 2:
					System.out.println("������");
					isChoice = true;
					break;
				default :
					System.out.println("��Ϲ���Ĩ");
			}
		}
		
	}

}
