package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���!");
		char one = sc.next().charAt(0); //�Է¹��� ���� ��� (char ����)
		int one1;
		one1 = (int)one;
		System.out.println(one + " " + one1);
		
		

	}

}
