package com.kh.whilesample;

import java.util.Scanner;

public class While01 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue) { // isTrue = true  �̱� ������ true ��� isTrue ���
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. 1.�Ƹ޸�ī�� 2.īǪġ�� 3.������ũƼ");
			int choice = sc.nextInt(); //while ������ �̵�
			
			switch (choice) {
				case 1:
					System.out.println("�Ƹ޸�ī�� �ֹ�!");
					isTrue = false;
					break;
				case 2:
					System.out.println("īǪġ�� �ֹ�!");
					isTrue = false;
					break;
				case 3:
					System.out.println("������ũƼ �ֹ�!");
					isTrue = false;
					break;
				default :
					System.out.println("1�� 2�� 3�� �߿� �ϳ��� �������ּ���!");
			}
		}

	}

}
