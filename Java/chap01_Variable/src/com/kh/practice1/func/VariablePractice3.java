package com.kh.practice1.func;

import java.util.Scanner;
 
public class VariablePractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���̴� : ");
		double width, height;
		
		width = sc.nextDouble();
		
		System.out.println("������ ���̴� : ");
		
		height = sc.nextDouble();
		
		System.out.println("���� : " + width + "���� : " + height);
		System.out.println("�ѷ��� ���̴� : " + ((2*width) + (2*height)));
		
	}
}
