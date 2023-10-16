package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		
		// 1. �ڵ� ����ȯ(�Ͻ���[������] ����ȯ)
		
		int intNum = 100;
		System.out.println(intNum); // ���� 100�� �ǹ�
		long longNum = intNum;      // int�� long���� �ڵ� ����ȯ
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;  // float�� double�� �ڵ� ����ȯ
		System.out.println(doubleNum);
		
		// int > long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		// 1.
		int inNum = 150;
		long loNum = inNum;
		System.out.println(loNum);
		// 2.
		int iNum = 2718;
		long logNum = iNum;
		System.out.println(logNum);
		//short > int �����ϴ� ����ȯ 1���� ����� ����ϱ�
		short shNum = 32542;
		int intNum1 = shNum;
		System.out.println(intNum1);
		
		//float > double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		float fltNum = 2.74f;
		System.out.println("fltNum : " + fltNum);
		double dobleNum = fltNum;
		System.out.println("dobleNum : " + dobleNum);
		
		
		// 2. ����� ����ȯ(���� ����ȯ)
		// long -> int
		long largeLong = 123456789012345L;
		System.out.print("LargeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.print("largeInt : ");
		System.out.println(largeInt); // long�� int�� ���� ����ȯ �� ��� ���� �����ȿ� ���� ������ �Ϻε����ʹ� �սǵȴ�.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart);
		
		// ���ڿ� ���� ���� ����ȯ 2�� ���
		// ���ڴ� char charBalue = 'Z'; -> int�� ����
		
		System.out.print("1. ");
		char charBalue = 'Z';
		int intChar = charBalue;
		System.out.println("intChar : " + intChar);
		
		char charBalue1 = 'A';
		int intChar1 = charBalue1;
		System.out.print("2. ");
		System.out.println("intChar1 : " + intChar1);
		
		//double -> int�� ����ȯ 1�� ���
		double larDouble = 2457.714689;
		int intPart1 = (int) larDouble;
		System.out.println("intPart1 : " + intPart1);
		
		//int�� short�� ����ȯ 1�� ���
		int intNumber = 157892;
		short shortNumber = (short) intNumber;
		System.out.println("shortNumber : " + shortNumber);
		
		//TEST
		int test = 65;
		System.out.println((char)test);
		
		
		
	}
}
