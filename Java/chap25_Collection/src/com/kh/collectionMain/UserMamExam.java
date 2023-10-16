package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMamExam {

	public static void main(String[] args) {
		//HashMap 생성 UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		//유저 이름과 나이
		UserAge.put("홍길동", 21);
		UserAge.put("주서경", 28);
		UserAge.put("박창규", 19);
		UserAge.put("송의재", 15);
		UserAge.put("이순신", 27);
		//특정 유저 검색
		String userName = "박창규";
		if(UserAge.containsKey(userName)) {
			int age = UserAge.get(userName);
			System.out.println(userName + "님의 나이는 " + age + "살 입니다.");
		} else {
			System.out.println("해당 유저는 존재하지 않습니다.");
		}
		//모든 유저 이름과 나이 출력
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + "님의 나이는 : " + age + "살 입니다.");
		}
		//유저 나이 수정
		String name = "박창규";
		int age = 17;
		UserAge.put(name, age);
		System.out.println(name + "님의 나이를 " + UserAge.get(name) + "으로 수정하였습니다.");
		
		//유저 탈퇴
		String removeName = "이순신";
		UserAge.remove(removeName);
		System.out.println("이름 삭제 후 출력 : " + UserAge);
		
		//최종 유저 이름과 나이 출력
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String rName = entry.getKey();
			int rAge = entry.getValue();
			System.out.println(UserAge.get(name) + rName + "님의 나이는 : " + rAge + "살 입니다.");
		}
		
		
		
		
		
	}

}
