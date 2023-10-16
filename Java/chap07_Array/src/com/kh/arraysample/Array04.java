package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		// Array 예제
		//                          0    1       2     3
		String[] inturnArray = {"홍길동","개똥이","흥부","놀부"};
		
		inturnArray[2] = "제비";
		System.out.println("흥부 대신 : " + inturnArray[2]);

		/*
		 예제 String[] fruitArray = {"사과","딸기","키위","메론","귤"};
		 1. 사과에는 바나나
		    딸기에는 수박
		    키위에는 레몬
		    메론에는 귤
		    귤에는 오렌지
		 */
		String[] fruitArray = {"사과","딸기","키위","메론","귤"};
		fruitArray[0] = "바나나";
		fruitArray[1] = "수박";
		fruitArray[2] = "레몬";
		fruitArray[3] = "귤";
		fruitArray[4] = "오렌지";
		
		for(int i = 0; i < fruitArray.length; i++) {
			System.out.println(i + "의 자리 :" + fruitArray[i]);
		}
		
		
		
		
		
	}

}
