package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		
		Map<String, Integer> user = new HashMap<>();
		
		user.put("홍길동", 23);
		user.put("김길동", 25);
		user.put("이순신", 21);
		user.put("유 신", 27);
		System.out.println(user.containsValue(22)); //true , false
		System.out.println(user.containsKey("유 신"));
		String userName = "유 신";
		
		if(user.containsKey(userName)) {
			int age = user.get(userName);
			System.out.println(userName + "님의 나이는 " + age + "살 입니다.");
		}else {
			System.out.println(userName + "님은 등록되지 않았습니다");
		}
		
		int age = 23;
		
		if(user.containsValue(age)) {
		
		}
		/*
		
		Map.Entry 인터페이스와 함게 사용되는 인터페이스
		getKey() : 객체의 키를 반환
		getValue(0 : 객체의 값을 반환
		
		*/
		//모든 학생과 성적을 출력
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
	
	}

}
