package com.kh.exceptionPractice;

import java.rmi.AccessException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain main = new PracticeMain();
		//main.ArithException();
		//main.NPException();
		//main.NFException();
		main.ExceptionExam();
	}

	public void ArithException() {
		// int dividend / divisor �������� �� ����ó��
		
		int dividend = 100;
		int divisor = 0;
		
		
		try {
			int result = dividend / divisor;
			System.out.println(dividend + " / " + divisor + " = " + result);
		} catch(ArithmeticException a) {
			System.out.println("0���� ���� �� �����ϴ�." + a.getMessage());
		}
	}
	
	public void NPException() {
		String text = "Hello World";
		String subText = null;
		
		try {
			//indexOf : subText �� �ִ� null ���� ������ ���ڿ� �˻�
			int length = text.indexOf(subText);
			System.out.println(length);
		}catch(NullPointerException er) {
			System.out.println("NullPointerException : )" + er.getMessage());
		}
		
	}
	
	public void NFException() {
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println("text : " + number);
		} catch (NumberFormatException a) {
			System.out.println("���� ������ �ƴϿ��� ��ȯ�� �� �����ϴ�." + a.getMessage());
			
		}
	}
	
	public void ExceptionExam() {
		int[] numbers = {1,2,3,4,5};
		int index = 7; // �ε��� �ѹ�
		
		try {
		int result = numbers[index]; //�迭 ��ҿ� ����
		System.out.println("Result : " + result);
		} catch (ArrayIndexOutOfBoundsException a) {
			//�迭 �ε����� ������ ����� �� �߻��ϴ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!!" + a.getMessage());
		} catch (Exception a) {
			//�ٸ� ���ܸ� ó���� �� �ִ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
		} finally {
			//�׻� ����Ǵ� ���
			System.out.println("Finally ����!");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	
	
}
