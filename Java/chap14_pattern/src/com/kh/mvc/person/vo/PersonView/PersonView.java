package com.kh.mvc.person.vo.PersonView;

public class PersonView {
	
	public void displayInfo(String name, int age, String hobby) {
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println("당신의 나이는 " + age + "살 이고,");
		System.out.println("당신의 취미는 " + hobby + " 입니다.");
	}
}
