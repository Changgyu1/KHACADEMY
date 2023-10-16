package com.kh.ifsample;

public class IfExam {
	
	public static void main(String[] args) {
		/*
		- 중첩 if문 or 이중 if문
		if (조건식1) {
			if (조건식2) {
				if (조건식3) {
					수행될 문장;
				} else if (조건식4) {
					수행될 문장;
				} else {
					수행될 문장;
				} 
			} else {
				수행될 문장;
			}
		} else {
			수행될문장
	}	
		*/
		
		//날씨에 따른 정보!
		int month = 9;
		int temp = -15;
		
		if (month == 1 || month == 2 || month == 12) {  // month가 1 or 2 or 12 이면
			System.out.println("겨울");    // 겨울 출력
			
			if (temp <= -15) {  // 겨울 이고 temp가 -15보다 작거나 같을때
				System.out.println("한파 경보!"); // 한파 경보
				
			} else if (temp <= -12) { // 겨울이고 temp가 -15보다 작고 -12보다 작거나 같을때
				System.out.println("한파 주의!"); // 한파 주의
				
			}
		} else if (month >= 3 && month <= 5) { // month가 3보다 크거나 같고 5보다 작거나 같을때
			System.out.println("봄");   // 봄 출력
			
		} else if (month >= 6 && month <= 8) { // month가 6보다 크거나 같고 8보다 작거나 같을때
			System.out.println("여름"); //여름 출력
			
			if (temp >= 35) { // 여름이고 temp가 35보다 크거나 같을 때
			System.out.println("폭염 주의"); // 폭염 출력
			
			} else if (temp >= 33) {  // temp가 35보다 작거나 33보다 크거나 같을 때
				System.out.println("폭염 주의보"); // 폭염주의보 출력
				
			}
		} else if (month >= 9 && month <= 11) { //month가 9보다 크거나 같고 11보다 작거나 같을때
			System.out.println("가을"); // 가을 출력
			
		}
		
		
		
		
	}
}
