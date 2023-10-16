package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * ���ڿ��� �Է� �޾� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ �� ��° �ε����� ��ġ�ϴ��� �ε���
		 * ����ϱ�
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ��� �Է��ϼ���!"); // ���ڿ��� �Է� �ޱ�
		String inputString = sc.next();

		System.out.println("�˻��� ���ڸ� �Է��ϼ���!");// �˻��� ���� �Է� �ޱ�
		char searchChar = sc.next().charAt(0); // ù ��°

		// ���ڿ��� -> ���ڷ� ��ȯ
		// ex)�ȳ��ϼ��� -> '��', '��', '��', '��' ,'��' -> �ϳ��� ��ȯ
		// toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		char[] charString = inputString.toCharArray();

		int charCount = charString.length;
		System.out.println("charCount : " + charCount);
		// String -> char
		// ���ڿ��� �� �� �� �ִ��� ������ -> length
		// �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� -> �ε��� �� ���
		// �� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		int count = 0;
		System.out.println(inputString + " �� " + searchChar + " �� �����ϴ� ��ġ(�ε���)");
		// �ݺ����� ����ؼ� ��ġ ã��
		for (int i = 0; i < charCount; i++) {
			// ���࿡ ���� �� ���ڸ� �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� ����ϱ�
			if (charString[i] == searchChar) { // ���ڹ迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
				// charString[i] ���� i�� �������� �ƴ϶� i���� �Ǿ�� �ϴ� ������
				// searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ��
				System.out.println(inputString + " �� " + searchChar + " �� �����ϴ� ��ġ(�ε���) " + i);
			}
			// 2. ���� �� �ϳ� �迭�� �ִ´�.
			// String �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
			// char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
			// String �ȿ� �ִ� ���ڵ��� �迭�� ������ִ� �༮ => toCharArray
			//
		}
	}
}