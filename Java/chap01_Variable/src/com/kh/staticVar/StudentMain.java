package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("ぞし");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		System.out.println(stKim.serialNum);
		StaticVar stLee = new StaticVar();
		stLee.setStudentName("げ2");
		System.out.println("ぞし : " + stKim.serialNum);
		System.out.println("げ2 : " + stLee.serialNum);
	}
}
