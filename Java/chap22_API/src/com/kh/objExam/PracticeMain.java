package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		run.practice1();
	}
	
	public void practice1() {
		//Scanner �̿��ؼ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է����ּ���!");
		String num1 = sc.nextLine();
		System.out.println("�� ��° ���ڸ� �Է����ּ���!");
		String num2 = sc.nextLine();
		
		sc.close();
		
		if(num1.equals(num2)) {
			System.out.println("���ڿ��� �����ϴ�.");
		} else {
			System.out.println("���ڿ��� �ٸ��ϴ�.");
			System.out.print("ù ��° ���� : " + num1 + " | �� ��° ���� : " + num2);
		}
		System.out.println();
		
		// ���ڿ��� �ؽ� �ڵ� ���
		int hashCode1 = num1.hashCode();
		int hashCode2 = num2.hashCode();
		System.out.println("ù ��° ���ڿ��� �ؽ��ڵ� : " + hashCode1);
		System.out.println("�� ��° ���ڿ��� �ؽ��ڵ� : " + hashCode2);
		
		// ���ڿ��� ���ڿ� ǥ�� ���
		String num1String = num1.toString();
		String num2String = num2.toString();
		System.out.println("���ڿ��� ���ڿ� ǥ��(1) : " + num1String);
		System.out.println("���ڿ��� ���ڿ� ǥ��(2) : " + num2String);
		
	}
}
