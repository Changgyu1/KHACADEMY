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
		// int dividend / divisor 나누었을 때 예외처리
		
		int dividend = 100;
		int divisor = 0;
		
		
		try {
			int result = dividend / divisor;
			System.out.println(dividend + " / " + divisor + " = " + result);
		} catch(ArithmeticException a) {
			System.out.println("0으로 나눌 수 없습니다." + a.getMessage());
		}
	}
	
	public void NPException() {
		String text = "Hello World";
		String subText = null;
		
		try {
			//indexOf : subText 에 있는 null 값을 포함한 문자열 검색
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
			System.out.println("값이 정수가 아니여서 변환할 수 없습니다." + a.getMessage());
			
		}
	}
	
	public void ExceptionExam() {
		int[] numbers = {1,2,3,4,5};
		int index = 7; // 인덱스 넘버
		
		try {
		int result = numbers[index]; //배열 요소에 접근
		System.out.println("Result : " + result);
		} catch (ArrayIndexOutOfBoundsException a) {
			//배열 인덱스가 범위를 벗어났을 때 발생하는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!!" + a.getMessage());
		} catch (Exception a) {
			//다른 예외를 처리할 수 있는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
		} finally {
			//항상 실행되는 블록
			System.out.println("Finally 등장!");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	
}
