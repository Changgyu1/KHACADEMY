package com.kh.practice4.func;

import java.util.Scanner;

public class forstar2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input");  // ���� �Է�
		int n = sc.nextInt();
		
		String v = "";  // String v = ""  ����
		for (int i = 0; i < n - 2; i++) {
			v += " ";
		}
		for (int j = 0; j < n; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < n - 2; j++) {
			System.out.println("*" + v + "*");
		}
		for (int j = 0; j < n; j++) {
			System.out.print("*");
		}
		System.out.println();

	}

}
