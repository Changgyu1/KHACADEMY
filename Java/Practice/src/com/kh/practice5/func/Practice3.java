package com.kh.practice5.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요!");
		int[] num ;
		
		int num1 = sc.nextInt();
		num = new int[num1];
		
		if (num1 > 0) {
		for (int i = 1; i <= num.length; i++) {
			System.out.println(i);
		}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요!");
		}
	}

}
