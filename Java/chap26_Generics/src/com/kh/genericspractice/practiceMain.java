package com.kh.genericspractice;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import com.kh.genericsMain.Box;

public class practiceMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
		practiceMain a = new practiceMain();
		
		//a.practice1();
		a.practice2();

	}
	/*
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
	public void practice1() {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("gdgd");
		strList.add("gdgd2");
		printList(strList);
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(3);
		intList.add(4);
		printList(intList);
	}
*/
	public void practice2() {
		// Box 객체를 com.kh.genericspractice; 밑에 생성
		// 정수형 데이터를 저장하는 Box 인스턴스 생성
		// 문자열 데이터를 저장하는 Box 인스턴스 생성
		// 각 각 출력 (향상된 for문 이용해서 출력)
		Box<Integer> box = new Box<>();
		box.put(2);
		box.put(3);
		box.put(7);
		box.put(1);
		
		int intValue = box.get();
		
		Box<String> sbox = new Box<>();
		sbox.put("Hello");
		sbox.put("홍길동");
		sbox.put("잘가~");
		String strValue = sbox.get();
		
	
		

		
	}

		
		

	
}

