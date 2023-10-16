package com.kh.example.Practice5.run;

import com.kh.example.Practice5.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.information();
		/*
		int[] balls = new int[45];
		
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		for (int i = 0; i < 50; i++) {
			int rNum = (int)(Math.random() * 45);
			int temp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = temp;
		}
		System.out.println("결과");
		for(int i = 0; i < balls.length; i++) {
			System.out.println(balls[i] + " ");
		}
		System.out.println();
		
		System.out.println("로또 번호");
		for(int i = 0; i < 6; i++) {
			System.out.println(balls[i] + " ");
		}*/
	}

}
