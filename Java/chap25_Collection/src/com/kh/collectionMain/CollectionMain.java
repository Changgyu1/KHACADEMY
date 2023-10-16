package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		CollectionMain run = new CollectionMain();
		
		// Map 예제
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("가나", 21);
		myMap.put("가나", 2);
		myMap.put("한국", 1);
		myMap.put("미국", 2);
		myMap.put("중국", 3);
		myMap.put("일본", 1);
		System.out.println(myMap);
		for(String c : myMap.keySet()) {
			int code = myMap.get(c);
			System.out.println(c + " " + code + "등");
		}
		
	}
	
	public void CollectionMain() {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.println("-- List --");
		// 향샹된 for문 활용해서 출력
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		// Set 예제
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(2); // 중복된 요소는 허용하지 않음
		myset.add(3);
		myset.add(4);		
		System.out.println("-- set --");
		for(Integer number : myset) {
			System.out.println(number);
		}
	}

}
