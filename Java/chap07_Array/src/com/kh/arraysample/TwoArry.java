package com.kh.arraysample;

public class TwoArry {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple","Banana","Cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi","Mango","PineApple"}
		};
		
		for(int i = 0; i < fruits.length; i++) {
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
			}
			System.out.println(); //���������� �̵��� �� �ְ� enter �� ��� �޼ҵ� �Է� 
		}
		
	}

}
