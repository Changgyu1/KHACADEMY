package com.kh.practice5.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		System.out.println("0 ~ 6 �� ������ �ϳ��� �Է����ּ���!");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] day = {"��","ȭ","��","��","��","��","��"};
		
		switch(count) {
			case 0: case 1: case 2: case 3: case 4: case 5: case 6:
				System.out.println(day[count]);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
				
		}
		
		

	}

}
