package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("����");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		System.out.println(stKim.serialNum);
		StaticVar stLee = new StaticVar();
		stLee.setStudentName("��2");
		System.out.println("���� : " + stKim.serialNum);
		System.out.println("��2 : " + stLee.serialNum);
	}
}
