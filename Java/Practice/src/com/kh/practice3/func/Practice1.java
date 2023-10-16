package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호만 입력해주세요. // 1.입력 2.수정 3.조회 4.삭제 7.종료");
		
		int choice = sc.nextInt();
		
		/** 1.if문 **/
		if (choice == 1) {
			System.out.println("입력");
		} else if (choice == 2) {
			System.out.println("수정");
		} else if (choice == 3) {
			System.out.println("조회");
		} else if (choice == 4) {
			System.out.println("삭제");
		} else if (choice == 7) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("지정된 번호만 입력해주세요!");
		}
		
		/** 2.switch문 **/
		
		switch (choice) {
			case 1:
				System.out.println("입력");
				break;
			case 2:
				System.out.println("수정");
				break;
			case 3:
				System.out.println("조회");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("지정된 번호만 입력해주세요!");
				
		}
	
	}

}
