package com.kh.practice10;

public class Practice10 {

	public static void main(String[] args) {
		
		//1. 주민번호 만들기
		String jumin = "123456-1234567";

		//2. 성별자리 이후 별표 만드는거 만들기
		String makeStar = "*";
		
		//3. 주민번호 성별자리 이후부터 *로 가리고 출력
		// to char Array를 사용해서 String -> char Array 로 변경
		char[] juminStar = jumin.toCharArray(); // {'1','2','3','4','5','6','-','1','','3','4','5','6','7'}
		
		for(int i = 8; i <= 13; i++) {
			juminStar[i] = '*';
			
		}
		System.out.print(juminStar);
	}

}
