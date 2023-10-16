package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		
		// 1. 자동 형변환(암시적[묵시적] 형변환)
		
		int intNum = 100;
		System.out.println(intNum); // 숫자 100을 의미
		long longNum = intNum;      // int를 long으로 자동 형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;  // float을 double로 자동 형변환
		System.out.println(doubleNum);
		
		// int > long 변경하는 형변환 2가지 만들고 출력하기
		// 1.
		int inNum = 150;
		long loNum = inNum;
		System.out.println(loNum);
		// 2.
		int iNum = 2718;
		long logNum = iNum;
		System.out.println(logNum);
		//short > int 변경하는 형변환 1가지 만들고 출력하기
		short shNum = 32542;
		int intNum1 = shNum;
		System.out.println(intNum1);
		
		//float > double 변경하는 형변환 1가지 만들고 출력하기
		float fltNum = 2.74f;
		System.out.println("fltNum : " + fltNum);
		double dobleNum = fltNum;
		System.out.println("dobleNum : " + dobleNum);
		
		
		// 2. 명시적 형변환(강제 형변환)
		// long -> int
		long largeLong = 123456789012345L;
		System.out.print("LargeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.print("largeInt : ");
		System.out.println(largeInt); // long을 int로 강제 형변환 할 경우 값이 범위안에 있지 않으면 일부데이터는 손실된다.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart);
		
		// 문자와 숫자 간의 형변환 2개 출력
		// 문자는 char charBalue = 'Z'; -> int로 변경
		
		System.out.print("1. ");
		char charBalue = 'Z';
		int intChar = charBalue;
		System.out.println("intChar : " + intChar);
		
		char charBalue1 = 'A';
		int intChar1 = charBalue1;
		System.out.print("2. ");
		System.out.println("intChar1 : " + intChar1);
		
		//double -> int로 형변환 1개 출력
		double larDouble = 2457.714689;
		int intPart1 = (int) larDouble;
		System.out.println("intPart1 : " + intPart1);
		
		//int를 short로 형변환 1개 출력
		int intNumber = 157892;
		short shortNumber = (short) intNumber;
		System.out.println("shortNumber : " + shortNumber);
		
		//TEST
		int test = 65;
		System.out.println((char)test);
		
		
		
	}
}
