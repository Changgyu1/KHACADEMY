package com.kh.example.practice1.model.vo;

public class Member {
	String memberId, memberPwd, memberName, Name;
	int age;
	char gender;
	String phone, email;
	
	public Member(String memberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	public void printName() {
		System.out.println("memberId : " + memberId);
		System.out.println("memberPwd : " + memberPwd);
		System.out.println("�̸� : " + memberName);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("�޴��� ��ȣ : " + phone);
		System.out.println("�̸��� : " + email);
	}
}
