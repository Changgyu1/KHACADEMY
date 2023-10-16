package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain run = new ExceptionMain();
		run.ExceptionA();
		run.ExceptionB();
		run.ExceptionC();
	}
	
	public void ExceptionA() {
		try {
			int result = 10/0; //0���� ������ �õ�
			System.out.println("result :" + result);
		} catch (ArithmeticException e) {
			/*
			ArithmeticException �������� ��� �������� �߻��ϴ� ����
			ArithmeticException e : e�� �츮�� ������ ������
			e�� ������ ������ �޼����� getMessage() �� ���޹޴´�.
			*/
			System.out.println("��� �������� ���� �߻��� ����!!" + e.getMessage());
		} 
	}
	
	public void ExceptionB() {
		try {
		String text = null;
		int lenght = text.length(); //������ ���µ� text�� ���� ���ڿ��� ���̸� ���
		System.out.println("���ڿ� ���� : " + lenght);
		} catch (NullPointerException nullExpt) {
			System.out.println("�� ����!!! / " + nullExpt.getMessage());
		}
	}
	
	public void ExceptionC() {
		try {
		String juminNumber = "�ȿ���904";
		int number= Integer.parseInt(juminNumber); //���ڿ��� ������ ��ȯ �õ�
		System.out.println("���� : + number"); // �ȿ� String�� ����ֱ� ������ ������ ���� ����
		} catch(NumberFormatException format) {
			System.out.println("���ڸ� �־��ּ���!");
			System.out.println("NumberFormatException �߻� : " + format.getMessage());
		}
		
	}
	
	
}
