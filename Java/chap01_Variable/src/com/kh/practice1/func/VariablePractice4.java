package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ABC;
		
		System.out.println("문자를 입력해주세요 : ");
		
		ABC = sc.nextLine();
		
		if(ABC.length() >= 3) {
			char ab = ABC.charAt(0);
			char aB = ABC.charAt(1);
			char Ab = ABC.charAt(2);
			System.out.println(ab);
			System.out.println(aB);
			System.out.println(Ab);
		}
		else {
			System.out.println("3가지 이상");
		}

	}

}
