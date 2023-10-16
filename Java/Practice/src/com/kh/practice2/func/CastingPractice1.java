package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 하나 입력하세요!");
		char one = sc.next().charAt(0); //입력받은 문자 출력 (char 문자)
		int one1;
		one1 = (int)one;
		System.out.println(one + " " + one1);
		
		

	}

}
