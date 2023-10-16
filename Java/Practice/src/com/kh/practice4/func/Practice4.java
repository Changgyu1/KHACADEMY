package com.kh.practice4.func;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = false;
		while(!isTrue) {
			System.out.println("한개의 숫자를 입력해주세요!");
			int num = sc.nextInt();
		 if(num <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요!");
		} else {
			for(int i = num; i > 0; i--) {
				System.out.println(i);
			}
			isTrue = true;
		}
	}
}
}



