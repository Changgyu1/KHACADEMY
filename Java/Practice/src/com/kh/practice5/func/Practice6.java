package com.kh.practice5.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		System.out.println("0 ~ 6 의 숫자중 하나를 입력해주세요!");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] day = {"월","화","수","목","금","토","일"};
		
		switch(count) {
			case 0: case 1: case 2: case 3: case 4: case 5: case 6:
				System.out.println(day[count]);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				
				
		}
		
		

	}

}
