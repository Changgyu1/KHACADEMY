package com.kh.practice4.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		1이상의 숫자를 입력하세요.
		
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		} if(num <= 0) {
			System.out.println("1미만의 숫자는 입력할 수 없습니다.");
		}
		
	}
}
	

