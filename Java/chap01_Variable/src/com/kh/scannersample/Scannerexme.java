package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	public static void main(String[] args) {
		
		// Ű���忡�� ���� 2���� �Է¹޾�, �� ���� ��, �� ,��, ������ �� ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		int inum1, inum2;
		
		
		System.out.println("ù��° ������ �Է����ּ���");
		inum1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ���");
		inum2 = sc.nextInt();
		
		System.out.println(inum1 - inum2);
		
		

	}
}
