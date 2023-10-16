package com.kh.ArrayListSample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//빈 ArrayList 생성
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : " + fruits); //fruits : []
		
		//요소 추가
		fruits.add("사과");
		System.out.println("사과 추가 : " + fruits); //fruits : [사과]
		
		fruits.add("바나나");
		System.out.println("바나나 추가 : " + fruits);
		
		fruits.add("딸기");
		System.out.println("딸기 추가 : " + fruits);
		
		//요소 개수 확인
		int size = fruits.size();
		System.out.println("과일 목록의 크기 : " + size);
		
		//인덱스를 사용하여 요소에 접근하자
		String firstFruits = fruits.get(0);
		System.out.println("첫 번째 과일 : " + firstFruits);

		//요소 수정할거야
		fruits.set(0, "수박");
		System.out.println("수정체크 : " + fruits);
		
		//요소 제거
		fruits.remove(0);
		System.out.println("바나나 제거 확인 : " + fruits);
		
		System.out.println("==========================");
		
		//ArrayList 순회해서 요소출력
		System.out.println("- 모든 과일 목록 -");
//	for(요소데이터타입) 정할변수명 : 목록이들어있는 변수명) {
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("==========================");
		
		//중복된 과일 제거
		//ArrayList 비우기
		fruits.clear();
		System.out.println("모든 과일 제거한 후 : " + fruits);
		
		
	}

}
