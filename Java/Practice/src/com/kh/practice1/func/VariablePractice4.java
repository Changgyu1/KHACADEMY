package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String s = sc.next();
		
		char indexNum1 = s.charAt(0);  // 문자를 1자씩 읽음  // charAt(0)   << 몇번쨰 자리를 읽을지 출력
		char indexNum2 = s.charAt(1);
		char indexNum3 = s.charAt(2);
		//    apple
		//    012345
		System.out.println("index 1번째 단어 : " + indexNum1);
		System.out.println("index 2번째 단어 : " + indexNum2);
		System.out.println("index 3번째 단어 : " + indexNum3);
		
		String p2 = s.substring(0,2);
		System.out.println("substring : " + p2);
		// 한자리가 아니라 자리를 지정해서 출력할 수 있음
		// 시작만 정해도 되고, 끝을 지정해도 됨
		// 자리 위치 정해서 출력하기
		// 시작만 작성할 경우 시작한 인덱스 위치부터 끝가지 출력된다.
	}

}
