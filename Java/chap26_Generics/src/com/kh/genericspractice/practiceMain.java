package com.kh.genericspractice;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import com.kh.genericsMain.Box;

public class practiceMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		practiceMain a = new practiceMain();
		
		//a.practice1();
		a.practice2();

	}
	/*
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
	public void practice1() {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("gdgd");
		strList.add("gdgd2");
		printList(strList);
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(3);
		intList.add(4);
		printList(intList);
	}
*/
	public void practice2() {
		// Box ��ü�� com.kh.genericspractice; �ؿ� ����
		// ������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		// ���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		// �� �� ��� (���� for�� �̿��ؼ� ���)
		Box<Integer> box = new Box<>();
		box.put(2);
		box.put(3);
		box.put(7);
		box.put(1);
		
		int intValue = box.get();
		
		Box<String> sbox = new Box<>();
		sbox.put("Hello");
		sbox.put("ȫ�浿");
		sbox.put("�߰�~");
		String strValue = sbox.get();
		
	
		

		
	}

		
		

	
}

