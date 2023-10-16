package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {

		PracticeCollection run = new PracticeCollection();
		run.practice1();
		run.practiceSet();
		run.practiceMap1();
	}

	public void practice1() {
		List<String> sList = new ArrayList<>();
		// String add �غ��� ���� ����ϱ�
		sList.add("���ڰ�");
		sList.add("�ʹ�");
		sList.add("�ſ�");
		sList.add("���ڰ�");
		sList.add("�ʹ�");

		for (String a : sList) {
			System.out.println("List : " + a);
		}

	}

	public void practiceSet() {
		Set<String> set = new HashSet<>();
		// String add �غ��� ���� ����ϱ� �ߺ��� �� add�ϱ�
		set.add("���ڰ�");
		set.add("�ʹ�");
		set.add("�ſ�");
		set.add("���ڰ�");
		set.add("�ʹ�");

		for (String a : set) {
			System.out.println("Set : " + a);
		}

	}

	public void practiceMap1() {

		// Ű�� ���� �̿��ؼ� map put �Ѵ��� ���� �������� ����غ���
		Map<String, Integer> mm = new HashMap<>();
		mm.put("����", 10);
		mm.put("�ʴ�", 5);
		mm.put("�״�", 7);
		mm.put("�׳��", 8);

		for (String a : mm.keySet()) {
			int b = mm.get(a);
			System.out.println(a + " " + b + "�� ¥��");
		}
	}

}
