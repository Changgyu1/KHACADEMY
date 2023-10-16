package com.kh.practice1.func;

import java.util.Scanner;
 
public class VariablePractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로의 길이는 : ");
		double width, height;
		
		width = sc.nextDouble();
		
		System.out.println("세로의 길이는 : ");
		
		height = sc.nextDouble();
		
		System.out.println("가로 : " + width + "세로 : " + height);
		System.out.println("둘레의 길이는 : " + ((2*width) + (2*height)));
		
	}
}
