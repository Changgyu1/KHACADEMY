package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int num2 = sc.nextInt();
 
		int result1 = cal.add(num1, num2);
		int result2 = cal.substruct(num1, num2);
		int result3 = cal.multiply(num1, num2);
		int result4 = cal.divide(num1, num2);

		System.out.println(num1 + " + " + num2 + " = " + result1);
		System.out.println(num1 + " - " + num2 + " = " + result2);
		System.out.println(num1 + " * " + num2 + " = " + result3);
		System.out.println(num1 + " / " + num2 + " = " + result4);

	}

}