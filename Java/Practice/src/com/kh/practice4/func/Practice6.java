package com.kh.practice4.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println(num1 + " 부터 " + num2 + "까지 숫자");
		/*
		 * if(num1 < num2) { for (int i = num1; i <= num2; i++) { System.out.println(i);
		 * } }else { for (int i = num1; i >= num2; i--) { System.out.println(i); } }
		 */
		// Math 자바 내장 클래스
		// main (가장 작은 값) 주어진 두개의 숫자 중에서 더 작은 값을 반환
		// max (가장 큰 값) 주어진 두개의 숫자 중에서 더 큰 값을 반환
		// minVale 는 5가 저장됨 || maxValue는 8이 저장됨
		int start = Math.min(num1, num2);
		// start에는 둘 중 상대적으로 더 작은 값이 들어간다.
		int end = Math.max(num1, num2);
		// end에는 둘 중 상대적으로 더 큰 값이 들어간다.

		for (int i = start; i <= end; i++) {
			System.out.println(i);

		}

	}

}

