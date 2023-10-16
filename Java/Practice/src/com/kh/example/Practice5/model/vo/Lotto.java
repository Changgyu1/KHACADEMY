package com.kh.example.Practice5.model.vo;

public class Lotto {
	int[] lotto = new int[6];
	
	public Lotto() {
		//번호 생성
		for(int i = 0; i < 6; i++) { // 6자리 번호 생성
			lotto[i] = (int)(Math.random() * 45) + 1; // 1부터 45까지 번호 생성
			//중복 번호 제거
			for (int j = 0; j < i; j++) { 
				if(lotto[i] == lotto[j]) {
					i--; //같은 숫자가 나오면 다시 빼준다
					break;
				}
			}
		
		}
		
	}
	
	public void information() {
		//출력
		System.out.println("로또 번호");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}
