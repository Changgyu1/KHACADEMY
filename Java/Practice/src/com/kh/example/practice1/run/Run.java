package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		Member member = new Member("chzhqk123", "asqpw157", "���ڹ�", 15, '��', "010-3377-4106", "chzhqk123@naver.com");
		
		member.changeName("���ڸ��־�");
		member.printName();
		

	}

}
