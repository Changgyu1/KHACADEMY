package com.kh.practice4.func;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("���ڸ� �Է����ּ���!");
		int num = sc.nextInt();
		
		
		
		if (num > 10) {
			System.out.println("9������ ���ڸ� �Է����ּ���!");
		} else {
			for (int i = num; i <= 9; i++) {
				System.out.println(i + "��");
				for (int k = 1; k <= 9; k++) {
					sum = i*k;
					System.out.println(i + " x " + k + " = " + sum);
					
				}
			}
		}
	}

}
