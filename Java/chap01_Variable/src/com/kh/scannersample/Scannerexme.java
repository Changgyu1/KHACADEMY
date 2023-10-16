package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	public static void main(String[] args) {
		
		// 키보드에서 정수 2개를 입력받아, 두 수의 합, 차 ,곱, 나누기 한 몫과 나머지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int inum1, inum2;
		
		
		System.out.println("첫번째 정수를 입력해주세요");
		inum1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요");
		inum2 = sc.nextInt();
		
		System.out.println(inum1 - inum2);
		
		

	}
}
