package com.kh.practice3.UserScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];
		System.out.println("5���� ������ �Է����ּ���!");
		// �迭���ٰ� 5���� ������ �Է��ϴ� ����
		for(int i = 0; i < 5; i++) {
			//ArrayList ��� () < ���
			//�迭�� [] �ȿ� ����
			//�迭�� �ڸ� ������ֱ�
			System.out.println((i+1) + "��° ���ڸ� �Է����ּ���!");
			number[i] = sc.nextInt();
		}
		int sum = 0;
		for(int total : number) {
			sum += total;
		}
		System.out.println(number.length + "���� ������ �� : " + sum);
	}

}
