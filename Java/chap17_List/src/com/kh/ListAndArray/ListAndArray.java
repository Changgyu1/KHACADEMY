package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	// Array ����
	public static void ListArray1() {
		int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����
		intArray[0] = 1;
		intArray[1] = 2;
		// Array ���
		System.out.print("Array ��� : ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}

		System.out.println();

		// List ����
		List<Integer> intList = new ArrayList<>(); // Integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);

		// List ���
		System.out.print("List ��� : ");
		for (int num : intList) {
			System.out.print(num + ", ");
		}
		System.out.println();

	}

	public void ListArray2() {
		String[] stringArray = new String[3];
		stringArray[0] = "ȫ�浿";
		stringArray[1] = "�谳��";
		stringArray[2] = "�̼���";

		System.out.print("�̸� ��� Array :");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + ", ");
		}
		System.out.println();

		// List
		List<String> stringList = new ArrayList<>();

		stringList.add("ȫ�浿");
		stringList.add("�谳��");
		stringList.add("�̼���");
		System.out.print("�̸� ��� List : ");
		for (String a : stringList) {
			System.out.print(a + ", ");
			
		}
	}

	
	public static void main(String[] args) {
		
		ListArray1(); 
		
		ListAndArray lss = new ListAndArray();
		lss.ListArray2();
		
	}
}
