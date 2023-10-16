package com.kh.switchsample;

import java.util.Scanner;

public class SwithchScanner {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라때");
		System.out.println("3. 아인슈페너");
		System.out.println("4. 흑당버블티");
		System.out.print("주문 번호 : ");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 2:
				System.out.println("카페라때 주문하셨습니다.");
				break;
			case 3:
				System.out.println("아인슈페너 주문하셨습니다.");
				break;
			case 4:
				System.out.println("흑당버블티 주문하셨습니다.");
				break;
			default :
				System.out.println("잘못된 주문 번호입니다. 다시 선택해주세요!");
				System.out.println("1번 2번 3번 4번 중 하나를 골라주세요!");	
		}
		Scanner sv = new Scanner(System.in);
		System.out.println("과일을 선택해주세요.");
		int fruit = sv.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("사과");
				break;
			case 2:
				System.out.println("포도");
				break;
			default:
				System.out.println("배");
		}
	*/
		//scanner 를 이용해서 과자를 선택하는 switch 를 하나 만들어주세요.
		Scanner so = new Scanner(System.in);
		
		boolean isChoice = false; // while 은 false 일 때 조건이 실행 , true 일 때 종료
			
		while (!isChoice) { // 초기 상태가 false while은 참일 때 종료
			int snack;
			System.out.println("과자를 선택해주세요!");
			snack = so.nextInt();
			switch (snack) {
				case 1:
					System.out.println("꼬깔콘");
					isChoice = true;
					break;
				case 2:
					System.out.println("오레오");
					isChoice = true;
					break;
				default :
					System.out.println("허니버터칩");
			}
		}
		
	}

}
