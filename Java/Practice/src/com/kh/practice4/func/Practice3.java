package com.kh.practice4.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		1�̻��� ���ڸ� �Է��ϼ���.
		
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		} if(num <= 0) {
			System.out.println("1�̸��� ���ڴ� �Է��� �� �����ϴ�.");
		}
		
	}
}
	

