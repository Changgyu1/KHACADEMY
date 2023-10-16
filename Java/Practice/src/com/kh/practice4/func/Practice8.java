package com.kh.practice4.func;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요!");
		int num = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i <= 9; i++) {
			sum += num;
			
			System.out.println(num + "*" + i + " = " + sum);
		}
		

	}

}
