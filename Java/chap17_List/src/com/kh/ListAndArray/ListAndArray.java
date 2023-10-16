package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	// Array 예제
	public static void ListArray1() {
		int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성
		intArray[0] = 1;
		intArray[1] = 2;
		// Array 출력
		System.out.print("Array 요소 : ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}

		System.out.println();

		// List 예제
		List<Integer> intList = new ArrayList<>(); // Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);

		// List 출력
		System.out.print("List 요소 : ");
		for (int num : intList) {
			System.out.print(num + ", ");
		}
		System.out.println();

	}

	public void ListArray2() {
		String[] stringArray = new String[3];
		stringArray[0] = "홍길동";
		stringArray[1] = "김개똥";
		stringArray[2] = "이순신";

		System.out.print("이름 목록 Array :");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + ", ");
		}
		System.out.println();

		// List
		List<String> stringList = new ArrayList<>();

		stringList.add("홍길동");
		stringList.add("김개똥");
		stringList.add("이순신");
		System.out.print("이름 목록 List : ");
		for (String a : stringList) {
			System.out.print(a + ", ");
			
		}
	}

	
	public static void main(String[] args) {
		
		ListArray1(); 
		
		ListAndArray lss = new ListAndArray();
		lss.ListArray2();
		
	}
}
