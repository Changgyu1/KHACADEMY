package com.kh.practice.exam;

import java.util.Scanner;

public class Practice8 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요.");
		int number = sc.nextInt();
		
		if (number < 1) { //만일 1미만의 숫자가 입력
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {// 1이상인 숫자들
			for (int i = 0; i <= number; i--) {
				System.out.println(number);
				
			}
		}

	}

}
