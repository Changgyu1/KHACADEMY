package com.kh.ArrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {

		ArrayList<String> todoList = new ArrayList<>();

		todoList.add("û���ϱ�");
		todoList.add("�������ϱ�");
		todoList.add("�����ϱ�");
		System.out.println("�� �� : " + todoList);

		todoList.set(0, "��Ա�");
		todoList.set(2, "Ƽ�񺸱�");
		System.out.println("�� �� (����): " + todoList);

		todoList.remove(1);
		System.out.println("�� �� (����): " + todoList);

		todoList.clear();
		System.out.println("�� �� (�����): " + todoList);
	}
}
