package com.kh.practice4.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ��� : ");
		int num2 = sc.nextInt();
		System.out.println(num1 + " ���� " + num2 + "���� ����");
		/*
		 * if(num1 < num2) { for (int i = num1; i <= num2; i++) { System.out.println(i);
		 * } }else { for (int i = num1; i >= num2; i--) { System.out.println(i); } }
		 */
		// Math �ڹ� ���� Ŭ����
		// main (���� ���� ��) �־��� �ΰ��� ���� �߿��� �� ���� ���� ��ȯ
		// max (���� ū ��) �־��� �ΰ��� ���� �߿��� �� ū ���� ��ȯ
		// minVale �� 5�� ����� || maxValue�� 8�� �����
		int start = Math.min(num1, num2);
		// start���� �� �� ��������� �� ���� ���� ����.
		int end = Math.max(num1, num2);
		// end���� �� �� ��������� �� ū ���� ����.

		for (int i = start; i <= end; i++) {
			System.out.println(i);

		}

	}

}

