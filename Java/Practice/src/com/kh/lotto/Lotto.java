package com.kh.lotto;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int select = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요!");
		select = sc.nextInt();
		int[] Lotto = new int[select];
		
		for(int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45) + 1;
			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
				System.out.print(Lotto[i]);
			}
		}
		System.out.println("===========");
		for(int i = 0; i < Lotto.length; i++) {
			System.out.println(Lotto[i] + ", ");
		}

	}

}
