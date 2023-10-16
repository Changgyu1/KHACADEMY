package com.kh.forsample;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 적어주세요!");
		int num1 = sc.nextInt();
		System.out.println("첫번째 숫자를 적어주세요!");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		for (int i = 1; i <= num2; i++) {
			result += num1;
			for (int k = 1; k <= num1; k++) {
			}
			System.out.println(num1 + " * " + i + " = " + result);
		}
		
	}
}
