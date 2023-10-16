package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {

		PracticeCollection run = new PracticeCollection();
		run.practice1();
		run.practiceSet();
		run.practiceMap1();
	}

	public void practice1() {
		List<String> sList = new ArrayList<>();
		// String add 해보고 포문 출력하기
		sList.add("잠자고");
		sList.add("싶다");
		sList.add("매우");
		sList.add("잠자고");
		sList.add("싶다");

		for (String a : sList) {
			System.out.println("List : " + a);
		}

	}

	public void practiceSet() {
		Set<String> set = new HashSet<>();
		// String add 해보고 포문 출력하기 중복된 값 add하기
		set.add("잠자고");
		set.add("싶다");
		set.add("매우");
		set.add("잠자고");
		set.add("싶다");

		for (String a : set) {
			System.out.println("Set : " + a);
		}

	}

	public void practiceMap1() {

		// 키와 값을 이용해서 map put 한다음 향상된 포문으로 출력해보기
		Map<String, Integer> mm = new HashMap<>();
		mm.put("나는", 10);
		mm.put("너는", 5);
		mm.put("그는", 7);
		mm.put("그녀는", 8);

		for (String a : mm.keySet()) {
			int b = mm.get(a);
			System.out.println(a + " " + b + "점 짜리");
		}
	}

}
