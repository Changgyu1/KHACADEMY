package com.kh.ifsample;

public class IfElseIfSample {
 
	public static void main(String[] args) {
		/*
		- if-else if-else
		- 여러 개의 조건을 연속적으로 평가
		- 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		- 만약 if나 else if 의 조건도 참이 아니라면 마지막 else 블록 실행
		if (조건1) {
			//조건1이 참일 때 실행되는 코드
		} else if (조건2) {
			//조건2가 참일 때 실행되는 코드
		} else {
			//위의 모든 조건이 거짓일 때 실행되는 코드
		}
		 */
		
		int age = 20; //20살
		
		if(age == 20) {
			System.out.println("해외여행을 갈거야!");
		}else if(age > 20) {
			System.out.println("세계여행을 갈거야!");
		}else {
			System.out.println("집에 있을거야!");
		}
		
		/* 
		 int score = 85;
		 90점 이면 B+
		 90점이 넘으면 A
		 90 미만이면 B
		 */
		int score = 90;
		if(score == 90) {
			System.out.println("당신의 등급은 : B+등급 입니다.");
		}else if(score > 90) {
			System.out.println("당신의 등급은 : A등급 입니다.");
		}else {
			System.out.println("당신의 등급은 : B등급 입니다.");
		}
		
		int hour = 15;
		if (hour < 12) {
			System.out.println("좋은 아침입니다.");
		}else if (hour < 18) {
			System.out.println("열심히 코딩합시다.");
		}else {
			System.out.println("수고하셨습니다.");
		}
		
		//날씨 체크
		int temp = 28;
		if (temp > 30) { // 31부터가 참
			System.out.println("더운 날씨입니다.");
		}else if (temp > 20) { //21 ~ 30 사이가 참
			System.out.println("적당한 날씨입니다.");
		}else { // 20이하 참
			System.out.println("추운 날씨입니다.");
		}
		
		int number = 0;
		if (number > 0) {  // 0보다 클 때 참 (true) 
			System.out.println("양수입니다.");
		}else if (number < 0) {  // 0보다 작을 때 (true)
			System.out.println("음수입니다.");
		}else { // 0일 때 참 (true)
			System.out.println("0 입니다.");
		}
		
		/*
		int myAge = 15; 나의 나이가 15살 일 때
		청소년인지 어린이인지 성인인지 출력하기 
		*/
		int myAge = 19; 
		if (myAge > 19) { 
			System.out.println("성인입니다."); 
		}else if (myAge > 12) { 
			System.out.println("청소년입니다.");
		}else {
			System.out.println("어린이입니다");
		}
		
		//계절 출력하기
		int month = 8;
		if (month == 1 || month == 2 || month == 12) { // 1월 2월 12월 일경우 겨울 참(true)
			System.out.println("겨울입니다.");
		}else if (month >= 3 && month <= 5) {  // 3월 ~ 5월 봄 참(true)
			System.out.println("봄입니다.");
		}else if (month >= 6 && month <= 8) { // 6월 ~ 8월 여름 참(true)
			System.out.println("여름입니다.");
		}else								// 위에 전부다 포함되어있지 않을경우 가을  거짓(false)
			System.out.println("가을입니다.");
		
		
	}

}
