package com.kh.forsample;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		
		//������ �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = sc.nextInt();
		
		int result = 0;                    //���� ���� 0���� �ݴϴ�.
		for (int i = 0; i < num2; i++) { // for ������ ����ؼ� i ������ 0���� num2 �̸����� �ݺ� 
										  //�� ������ �ι�° ������ num2 ��ŭ �ݺ�
			result += num1;
			//result ������ num1 ���� ����
			//num2 ��ŭ num1�� ���ϴ� ȿ��
			System.out.println(num1 + " * " + num2 + " = " + result);
		}
		


}
}
//1 * 1 = 1
//1 * 2 = 2
//1 * 3 = 3