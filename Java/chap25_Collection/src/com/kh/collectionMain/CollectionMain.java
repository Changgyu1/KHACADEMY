package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		CollectionMain run = new CollectionMain();
		
		// Map ����
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("����", 21);
		myMap.put("����", 2);
		myMap.put("�ѱ�", 1);
		myMap.put("�̱�", 2);
		myMap.put("�߱�", 3);
		myMap.put("�Ϻ�", 1);
		System.out.println(myMap);
		for(String c : myMap.keySet()) {
			int code = myMap.get(c);
			System.out.println(c + " " + code + "��");
		}
		
	}
	
	public void CollectionMain() {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("���");
		myList.add("�ٳ���");
		myList.add("����");
		
		System.out.println("-- List --");
		// �⼧�� for�� Ȱ���ؼ� ���
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		// Set ����
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(2); // �ߺ��� ��Ҵ� ������� ����
		myset.add(3);
		myset.add(4);		
		System.out.println("-- set --");
		for(Integer number : myset) {
			System.out.println(number);
		}
	}

}
