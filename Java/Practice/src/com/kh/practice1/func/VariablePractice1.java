package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		int age;
		float key;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("성별을 입력하세요 : ");
		gender = sc.next();
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		key = sc.nextFloat();
		
		System.out.println("키 " + key + "cm인 " + age + "살 " + gender + " " + name + "님 반갑습니다.");
		
		
		
	}

}
