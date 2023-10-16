package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		double kor = sc.nextDouble();
		
		System.out.println("영어점수 : ");
		double eng = sc.nextDouble();
		
		System.out.println("수학점수 : ");
		double mat = sc.nextDouble();
		
		int averageScore = (int)(kor + eng + mat);
		int totalScore = (averageScore / 3);
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
		System.out.println("합계 : " + averageScore);
		System.out.println("평균 : " + totalScore);
	}

}
