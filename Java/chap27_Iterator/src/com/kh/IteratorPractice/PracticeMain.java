package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		food.add("�ܹ���");
		food.add("����");
		food.add("ġŲ");
		food.add("�߰���");
		food.add("����");
		food.add("����");
		
		Iterator<String> ite = food.iterator();
		
		while(ite.hasNext()) {
			String ab = ite.next();
			
			System.out.print(ab + ", ");
		}
		System.out.println();
		System.out.println("iterator ���� �� ���");
		//Iterator�� ����Ͽ� ��� ����
		ite = food.iterator(); // �ٽ� Iterator �ʱ�ȭ
		
		while(ite.hasNext()) {
			String ab = ite.next();
			//���࿡ Ʈ��Ʈ�� ������ �����ϱ� ����
			if(ab.equals("ġŲ")) {
				ite.remove();
			} else {
				System.out.print(ab + ", ");
			}
		}
		System.out.println();
		System.out.println("���� �� ���");
		for(String a : food) {
			System.out.print(a + ", ");
		}
		
	}

}
