package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		//ArrayList �̿��ؼ� ���ֳ����ĳ���
		color.add("��"); color.add("��"); color.add("��"); color.add("��");
		color.add("��"); color.add("��"); color.add("��");
		System.out.println("���� : " + color);
		
		//���� 3ȸ 1,3,5 ->��, ����, �׸� ����
		color.set(1, "��");
		color.set(3, "����");
		color.set(5, "�׸�");
		System.out.println("���� �� ���� : " + color);
		
		//���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
		color.add(2, "���ο�"); color.add(6, "�����Ķ�");
		System.out.println("���ϱ� �� ���� : " + color);
		
		//���� for�� �̿��ؼ� ���� ����ϱ�
		System.out.println("- ���� ��� -");
		for(String col : color) {
			System.out.println(col);
		}
		
		//�� �� ��� �� �� ��
		//1.�ε��� ��� ���
		System.out.println("�ε��� ������� ���");
		System.out.println("�� �� ��� : " + color.get(0) + ", " + color.get(5) + ", " + color.get(8));
		System.out.println("���� �� ���");

		//3.���� �� ���
		color.remove(1); color.remove(1); color.remove(1); color.remove(1); color.remove(2); color.remove(2);
		System.out.println("�� �� ��� : " + color.get(0) + ", " + color.get(1) + ", " + color.get(2));
		
		System.out.println("�ʱ�ȭ �� ���");
		//2.�ʱ�ȭ �� ���
		color.clear();
		color.add("��"); color.add("��"); color.add("��");
		System.out.println("�� �� ��� : " + color.get(0) + ", " + color.get(1) + ", " + color.get(2));

	}

}