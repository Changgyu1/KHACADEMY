package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		// Array ����
		//                          0    1       2     3
		String[] inturnArray = {"ȫ�浿","������","���","���"};
		
		inturnArray[2] = "����";
		System.out.println("��� ��� : " + inturnArray[2]);

		/*
		 ���� String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		 1. ������� �ٳ���
		    ���⿡�� ����
		    Ű������ ����
		    �޷п��� ��
		    �ֿ��� ������
		 */
		String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		
		for(int i = 0; i < fruitArray.length; i++) {
			System.out.println(i + "�� �ڸ� :" + fruitArray[i]);
		}
		
		
		
		
		
	}

}
