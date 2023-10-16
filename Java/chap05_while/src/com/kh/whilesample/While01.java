package com.kh.whilesample;

import java.util.Scanner;

public class While01 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue) { // isTrue = true  이기 떄문에 true 대신 isTrue 사용
			System.out.println("커피를 주문해주세요. 1.아메리카노 2.카푸치노 3.말차밀크티");
			int choice = sc.nextInt(); //while 안으로 이동
			
			switch (choice) {
				case 1:
					System.out.println("아메리카노 주문!");
					isTrue = false;
					break;
				case 2:
					System.out.println("카푸치노 주문!");
					isTrue = false;
					break;
				case 3:
					System.out.println("말차밀크티 주문!");
					isTrue = false;
					break;
				default :
					System.out.println("1번 2번 3번 중에 하나를 선택해주세요!");
			}
		}

	}

}
