package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMamExam {

	public static void main(String[] args) {
		//HashMap ���� UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		//���� �̸��� ����
		UserAge.put("ȫ�浿", 21);
		UserAge.put("�ּ���", 28);
		UserAge.put("��â��", 19);
		UserAge.put("������", 15);
		UserAge.put("�̼���", 27);
		//Ư�� ���� �˻�
		String userName = "��â��";
		if(UserAge.containsKey(userName)) {
			int age = UserAge.get(userName);
			System.out.println(userName + "���� ���̴� " + age + "�� �Դϴ�.");
		} else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
		//��� ���� �̸��� ���� ���
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + "���� ���̴� : " + age + "�� �Դϴ�.");
		}
		//���� ���� ����
		String name = "��â��";
		int age = 17;
		UserAge.put(name, age);
		System.out.println(name + "���� ���̸� " + UserAge.get(name) + "���� �����Ͽ����ϴ�.");
		
		//���� Ż��
		String removeName = "�̼���";
		UserAge.remove(removeName);
		System.out.println("�̸� ���� �� ��� : " + UserAge);
		
		//���� ���� �̸��� ���� ���
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String rName = entry.getKey();
			int rAge = entry.getValue();
			System.out.println(UserAge.get(name) + rName + "���� ���̴� : " + rAge + "�� �Դϴ�.");
		}
		
		
		
		
		
	}

}
