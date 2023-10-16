package com.kh.practice.arraylist;

public class Practice8 {

	public static void main(String[] args) {
		// 1. �л� �̸��� �����ϴ� ���ڿ� �迭 �����ϰ� �ʱ�ȭ
		String[] student = {"���ǰ�", "������", "���볲", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		// 2. �� �д��� ��� ���� ������ ���� rows �ళ�� cols ������
		int rows = 3;
		int cols = 2;

		//3. �� ���� 2���� ���ڿ� �迭 classRoom1 classRoom2 ���� �� �ʱ�ȭ
		//�� �д��� �ڸ� ��ġ�� ��Ÿ��
		String[][] classRoom1 = new String[rows][cols];
		String[][] classRoom2 = new String[rows][cols];

		// i ������ �л� �ε���
		for (int i = 0; i < student.length; i++) { // 4. �л� �迭�� �ݺ�ó���ϱ� ���� �ݺ���
			int row = i % rows; // row ������ �� �ε���
			int col = i / rows; // col ������ �� �ε���

			if (col % 2 == 0) { // ���� ���� ¦�� ������ Ȯ��
								//¦�� ���� ù ���� �дܿ� �ش�
				classRoom1[row][col / 2] = student[i]; // col/2 �� �ε����� ������ ������ ��ġ
			} else { // ���� ���� Ȧ�� ���� ��� �� ��° �дܿ� �ش�
				classRoom2[row][col / 2] = student[i];
			}
		}
		System.out.println("===== 1�и� =====");
		printClassRoom(classRoom1);
		//classRoom1;
		System.out.println("===== 2�и� =====");
		printClassRoom(classRoom2);
		//classRoom2;

	}
	//classRoom ��� �޼ҵ�
	//classRoom ��� �޼ҵ� �д� �ڸ� ��ġ�� ����ϴ� ����
	public static void printClassRoom(String[][] classRoom) {
		for(int row = 0; row < classRoom.length; row++) { // ���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ�
			
			for(int col = 0; col < classRoom[0].length; col++) { // ���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ�
				
				System.out.print(classRoom[row][col] + " "); // ���� ��ġ�� �ִ� �л��� �̸� ���
			}
			System.out.println(); // ���๮��
		}
	}

}
