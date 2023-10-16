package com.kh.ArrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {

		ArrayList<String> todoList = new ArrayList<>();

		todoList.add("청소하기");
		todoList.add("설거지하기");
		todoList.add("빨래하기");
		System.out.println("할 일 : " + todoList);

		todoList.set(0, "밥먹기");
		todoList.set(2, "티비보기");
		System.out.println("할 일 (수정): " + todoList);

		todoList.remove(1);
		System.out.println("할 일 (삭제): " + todoList);

		todoList.clear();
		System.out.println("할 일 (지우기): " + todoList);
	}
}
