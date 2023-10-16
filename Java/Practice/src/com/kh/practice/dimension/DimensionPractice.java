package com.kh.practice.dimension;

public class DimensionPractice {
	int[][] num = new int[5][5];
	int num1 = 1;
	public DimensionPractice() {

	}

	public void practice1() {
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++)
				System.out.print("(" + i + "," + a + ")");
			System.out.println();
		}
	}
	
	public void practice2() { //배열에 대입할 첫번째 수 num을 선언하고 초기화한다.
		for(int i = 0; i < num.length; i++) { //배열num의 행의 길이만큼 반복문이 수행된다
			for(int k = 0; k < num[i].length; k++) { //배열num[i]의 열의 길이만큼 반복문이 수행된다
				num[i][k] = num1; // num[i][k]에 num1을 대입한다
				System.out.print(num[i][k] + " "); //배열 num에 들어있는 숫자를 출력한다
				num1++; // num1을 1 증가시킨다
			}
			System.out.println(); //줄을 바꾼다
		}
	}
}
