package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.PracticeStack();
		pm.PracticeQueue();
	}

	public void PracticeStack() {
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.pop();
		System.out.println("stack size : " + stack.size());
		System.out.println("stack peek : " + stack.peek());
		System.out.println("stack empty : " + stack.empty()); // 비어있는지 판단 (비어있으면 flase)
		System.out.println("stack contains : " + stack.contains(1)); // 1이 존재하는지 판단
		stack.clear();
		System.out.println("stack clear 후 size :" + stack.size());
	}

	public void PracticeQueue() {
		// 큐에 요소 추가 반환 삭제하고 while 사용해보기
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("홍길동");
		queue.offer("김길동");
		queue.offer("김개똥");
		queue.offer("이순신");
		queue.offer("김할동");
		queue.offer("박길동");
		
		//요소 삭제 반환
		queue.poll();
		queue.remove("이순신");
		
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);  
		}
		
	}

}
