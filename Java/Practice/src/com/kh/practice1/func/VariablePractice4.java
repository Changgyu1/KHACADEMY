package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String s = sc.next();
		
		char indexNum1 = s.charAt(0);  // ���ڸ� 1�ھ� ����  // charAt(0)   << ����� �ڸ��� ������ ���
		char indexNum2 = s.charAt(1);
		char indexNum3 = s.charAt(2);
		//    apple
		//    012345
		System.out.println("index 1��° �ܾ� : " + indexNum1);
		System.out.println("index 2��° �ܾ� : " + indexNum2);
		System.out.println("index 3��° �ܾ� : " + indexNum3);
		
		String p2 = s.substring(0,2);
		System.out.println("substring : " + p2);
		// ���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����
		// ���۸� ���ص� �ǰ�, ���� �����ص� ��
		// �ڸ� ��ġ ���ؼ� ����ϱ�
		// ���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�.
	}

}
