package com.kh.stackMain;

import java.util.Stack;

public class stackMain {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// push() :  stack �� �߰�
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// pop() : stack �� ����
		stack.pop();
		
		// clear() : ��ü �� ���� (�ʱ�ȭ)
		stack.clear();
		
		// peek() : ���� ����� ��(���� �������� ���� ��)
		stack.peek();
		
		// size() : stack �� ũ�� ���
		stack.size();
		
		// empty() : ������ ����ִ��� check
		// ����ִٸ� true �ϳ��� ����ִٸ� false
		stack.empty();
		
		// contains(1) :stack�� 1�� �ִ��� check 1�� �����Ѵٸ� true
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
