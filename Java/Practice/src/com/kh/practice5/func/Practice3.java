package com.kh.practice5.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���!");
		int[] num ;
		
		int num1 = sc.nextInt();
		num = new int[num1];
		
		if (num1 > 0) {
		for (int i = 1; i <= num.length; i++) {
			System.out.println(i);
		}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
		}
	}

}
