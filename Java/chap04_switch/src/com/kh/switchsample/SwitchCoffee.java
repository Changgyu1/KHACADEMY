package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {
 
	public static void main(String[] args) {
		//while문을 활용한 switch
		
		Scanner sc = new Scanner(System.in);
		
		int coffee;
		boolean DeCoffee = false; // while 은 false 일 때 조건이 실행 , true 일 때 종료
		
		while (!DeCoffee) { // 조건이 참인 동안 코드 블록을 반복적으로 실행
			System.out.println("커피를 선택해 주세요!");
			System.out.println("1번 아메리카노 2번 카페라때 3번 홍차");
			coffee = sc.nextInt();
			
			switch (coffee) {
				case 1:
					System.out.println("아메리카노 주문");
					DeCoffee = true;
					break;
				case 2:
					System.out.println("카페라때 주문");
					DeCoffee = true;
					break;
				case 3:
					System.out.println("홍차 주문");
					DeCoffee = true;
					break;
				default :
					System.out.println("잘못된 선택입니다. 다시주문 해주세요!");
			
			}
		}
		
	}

}
