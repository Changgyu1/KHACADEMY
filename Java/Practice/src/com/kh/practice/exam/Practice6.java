package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		int number = sc.nextInt();
		
		if (number < 1) { //���� 1�̸��� ���ڰ� �Է�
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {// 1�̻��� ���ڵ�
			for (int i = 1; i <= number; i++) {
				System.out.println(i);
			}
		}

	}

}
