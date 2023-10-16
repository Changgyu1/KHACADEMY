package com.kh.forsample;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		
		//구구단 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		
		int result = 0;                    //최초 값을 0으로 줍니다.
		for (int i = 0; i < num2; i++) { // for 루프를 사용해서 i 변수를 0부터 num2 미만까지 반복 
										  //이 루프는 두번째 숫자인 num2 만큼 반복
			result += num1;
			//result 변수에 num1 값을 더함
			//num2 만큼 num1을 더하는 효과
			System.out.println(num1 + " * " + num2 + " = " + result);
		}
		


}
}
//1 * 1 = 1
//1 * 2 = 2
//1 * 3 = 3