package com.kh.practice4.func;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int num = sc.nextInt();
		
		boolean isTrue = true;
		
		for(int i = 2; i <= num/2; i++) {
			if(num%2 == 0) {
				
				isTrue = false;
				break;
			}
		}
		System.out.println(isTrue ? "소수입니다" : "소수가아닙니다");
		
}
}
