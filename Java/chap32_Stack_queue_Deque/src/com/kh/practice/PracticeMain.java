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
		System.out.println("stack empty : " + stack.empty()); // ����ִ��� �Ǵ� (��������� flase)
		System.out.println("stack contains : " + stack.contains(1)); // 1�� �����ϴ��� �Ǵ�
		stack.clear();
		System.out.println("stack clear �� size :" + stack.size());
	}

	public void PracticeQueue() {
		// ť�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("ȫ�浿");
		queue.offer("��浿");
		queue.offer("�谳��");
		queue.offer("�̼���");
		queue.offer("���ҵ�");
		queue.offer("�ڱ浿");
		
		//��� ���� ��ȯ
		queue.poll();
		queue.remove("�̼���");
		
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);  
		}
		
	}

}
