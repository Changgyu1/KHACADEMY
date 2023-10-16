package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";

		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("안녕하세요. " + name + "입니다. 오늘 " + hour + "시에 배송됩니다.");
		System.out.println("저의 성적은 " + score + "입니다.");
		System.out.println(score + "점은 " + grade + "입니다.");

		// 변수에 이름과 나이와 자신의 성적 (double)로 넣기.
		String name1;
		name1 = "박창규";
		int age = 25;
		double sco = 87.2;
		char gad = 'B';
		System.out.print("안녕하세요. 저의 이름은 " + name1 + "입니다. 저의 나이는 " + age + "이고, ");
		System.out.print("저의 성적은 " + sco + "점으로 " + gad + "등급 입니다.");
	}

}
