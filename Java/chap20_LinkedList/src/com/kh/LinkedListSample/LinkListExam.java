package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkListExam {

	public static void main(String[] args) {
		//List �������̽� LinkedList ��ü Ȱ���ؼ� �� �ְ� ���
		// String �� �ְ� ���� ���� ���
		List<String> list = new LinkedList<>();
		list.add("ȫ�浿");
		list.add("�谳��");
		list.add("�̼�2��");
		list.add("�̼�3��");
		list.add("�̼�1��");
		list.add("�̼�4��");
		list.add("�̼�6��");
		System.out.println("�߰� �� ��� : " + list);
		
		list.set(0, "���̵�");
		System.out.println("���� �� ��� : " + list);
		
		list.remove(2);
		System.out.println("���� �� ��� : " + list);
		list.add(0, "ȫ�浿");
		System.out.println("�ٽ� �߰� �� ��� : " + list);
		//LinkedList ��ü new LinkedList ��ü 
		//int �� �ְ� ���� ���� ���
		LinkedList<Integer> linklist = new LinkedList<>();
		linklist.add(10);
		linklist.add(7);
		linklist.add(9);
		System.out.println("int �߰� �� ��� : " + linklist);
		
		linklist.set(1, 10);
		System.out.println("int ���� �� ��� : " + linklist);
		
		
		
	}

}
