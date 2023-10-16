package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {

	public static void main(String[] args) {
		PracticeMain4 run = new PracticeMain4();
		
		run.practice1();
		System.out.println();
		run.practice2();
		System.out.println();
		run.practice3();
		System.out.println();
		run.practice4();

	}
	
	public void practice1() {
		//��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String fromatStr = String.format("���� ��¥ : %s", smDateFormat.format(currentDate));
		System.out.println(fromatStr);
				
	}
	
	public void practice2() {
		int num1 = 123;
		int num2 = 7;
		String abc = String.format("���� 1 : %d\n���� 2 : %d", num1, num2);
		//String ������ = String.format("���� ���");
		System.out.println(abc);
	}
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		//��µǴ� ������ �ּ� �ʺ� �ڸ� 5�ڸ��� �ϰ�ʹ�.
		String abc = String.format("���� 1 : %03d\n���� 2 : %03d", num1, num2);
		//String ������ = String.format("���� ���");
		System.out.println(abc);
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		//���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		//' ����ǥ�� �ѷ� �׾ƾ���
		String formatStr = String.format("'%-10s'\n'%10s'",text1, text2);
		System.out.println(formatStr);
	}
	
	
	
}
