package com.kh.practice4.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println(i);
		} if (num < 0) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
		}
	}

}
