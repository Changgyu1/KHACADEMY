package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		
		Map<String, Integer> user = new HashMap<>();
		
		user.put("ȫ�浿", 23);
		user.put("��浿", 25);
		user.put("�̼���", 21);
		user.put("�� ��", 27);
		System.out.println(user.containsValue(22)); //true , false
		System.out.println(user.containsKey("�� ��"));
		String userName = "�� ��";
		
		if(user.containsKey(userName)) {
			int age = user.get(userName);
			System.out.println(userName + "���� ���̴� " + age + "�� �Դϴ�.");
		}else {
			System.out.println(userName + "���� ��ϵ��� �ʾҽ��ϴ�");
		}
		
		int age = 23;
		
		if(user.containsValue(age)) {
		
		}
		/*
		
		Map.Entry �������̽��� �԰� ���Ǵ� �������̽�
		getKey() : ��ü�� Ű�� ��ȯ
		getValue(0 : ��ü�� ���� ��ȯ
		
		*/
		//��� �л��� ������ ���
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
	
	}

}
