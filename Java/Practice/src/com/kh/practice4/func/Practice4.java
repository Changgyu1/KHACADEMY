package com.kh.practice4.func;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = false;
		while(!isTrue) {
			System.out.println("�Ѱ��� ���ڸ� �Է����ּ���!");
			int num = sc.nextInt();
		 if(num <= 0) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
		} else {
			for(int i = num; i > 0; i--) {
				System.out.println(i);
			}
			isTrue = true;
		}
	}
}
}



