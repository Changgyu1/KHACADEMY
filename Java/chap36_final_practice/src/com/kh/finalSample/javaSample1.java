package com.kh.finalSample;

import java.util.Scanner;

public class javaSample1 {

	public static void main(String[] args) {
		javaSample1 js = new javaSample1();
		js.inputText();

	}
	
	public void inputText() {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) {
			System.out.println("문자열을 입력해주세요.");
			String str = sc.nextLine();
			
			if(str == "out") {
				a = false;
				break;
			} else {
				System.out.println(str.length());
			}
			
		}
		System.out.println("program Finsih");
	}

}
