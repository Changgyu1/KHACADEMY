package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		run.practice1();
	}
	
	public void practice1() {
		//Scanner 이용해서 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 문자를 입력해주세요!");
		String num1 = sc.nextLine();
		System.out.println("두 번째 문자를 입력해주세요!");
		String num2 = sc.nextLine();
		
		sc.close();
		
		if(num1.equals(num2)) {
			System.out.println("문자열이 같습니다.");
		} else {
			System.out.println("문자열이 다릅니다.");
			System.out.print("첫 번째 문자 : " + num1 + " | 두 번째 문자 : " + num2);
		}
		System.out.println();
		
		// 문자열의 해시 코드 출력
		int hashCode1 = num1.hashCode();
		int hashCode2 = num2.hashCode();
		System.out.println("첫 번째 문자열의 해시코드 : " + hashCode1);
		System.out.println("두 번째 문자열의 해시코드 : " + hashCode2);
		
		// 문자열의 문자열 표현 출력
		String num1String = num1.toString();
		String num2String = num2.toString();
		System.out.println("문자열의 문자열 표현(1) : " + num1String);
		System.out.println("문자열의 문자열 표현(2) : " + num2String);
		
	}
}
