package com.kh.practice3.UserScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];
		System.out.println("5개의 정수를 입력해주세요!");
		// 배열에다가 5개의 정수를 입력하는 포문
		for(int i = 0; i < 5; i++) {
			//ArrayList 경우 () < 사용
			//배열은 [] 안에 넣음
			//배열의 자리 만들어주기
			System.out.println((i+1) + "번째 숫자를 입력해주세요!");
			number[i] = sc.nextInt();
		}
		int sum = 0;
		for(int total : number) {
			sum += total;
		}
		System.out.println(number.length + "개의 숫자의 합 : " + sum);
	}

}
