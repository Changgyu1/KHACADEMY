package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자를 입력해주세요!");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
	}

}
