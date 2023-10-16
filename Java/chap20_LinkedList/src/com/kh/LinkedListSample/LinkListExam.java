package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkListExam {

	public static void main(String[] args) {
		//List 인터페이스 LinkedList 객체 활용해서 값 넣고 출력
		// String 값 넣고 수정 삭제 출력
		List<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("김개똥");
		list.add("이순2신");
		list.add("이순3신");
		list.add("이순1신");
		list.add("이순4신");
		list.add("이순6신");
		System.out.println("추가 후 출력 : " + list);
		
		list.set(0, "오이도");
		System.out.println("수정 후 출력 : " + list);
		
		list.remove(2);
		System.out.println("삭제 후 출력 : " + list);
		list.add(0, "홍길동");
		System.out.println("다시 추가 후 출력 : " + list);
		//LinkedList 객체 new LinkedList 객체 
		//int 값 넣고 수정 삭제 출력
		LinkedList<Integer> linklist = new LinkedList<>();
		linklist.add(10);
		linklist.add(7);
		linklist.add(9);
		System.out.println("int 추가 후 출력 : " + linklist);
		
		linklist.set(1, 10);
		System.out.println("int 수정 후 출력 : " + linklist);
		
		
		
	}

}
