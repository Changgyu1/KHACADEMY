package com.kh.practice4.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isTrue = false;
		
		
		while(!isTrue) {
			System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���!");
			} else {
				for(int i = 1; i <= num; i++) {
					System.out.println(i);
				}
				isTrue = true;
				
			}
			
		}
		
	}
}
