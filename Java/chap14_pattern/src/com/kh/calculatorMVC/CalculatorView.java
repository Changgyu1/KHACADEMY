package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	
	public int getUserInput() {                      // 클라이언트가 넣을 값
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요!");
		return sc.nextInt();
	}
	
	public void displayResult(int result) {          // 계산된 결과
		System.out.println("결과 : " + result);
	}
	
	
	
}
