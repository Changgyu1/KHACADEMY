package com.kh.stackMain;

import java.util.Stack;

public class stackMain {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// push() :  stack 값 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// pop() : stack 값 삭제
		stack.pop();
		
		// clear() : 전체 값 제거 (초기화)
		stack.clear();
		
		// peek() : 가장 상단의 값(가장 마지막에 넣은 값)
		stack.peek();
		
		// size() : stack 의 크기 출력
		stack.size();
		
		// empty() : 스택이 비어있는지 check
		// 비어있다면 true 하나라도 들어있다면 false
		stack.empty();
		
		// contains(1) :stack에 1이 있는지 check 1이 존재한다면 true
		stack.contains(1);
		/*
		|		|
		|		|
		|	3	|
		|	2	|
		|___1___|
		
		
		
		*/
		System.out.println(stack.pop()); // 3
		System.out.println(stack.pop()); // 2

		
	}
}
