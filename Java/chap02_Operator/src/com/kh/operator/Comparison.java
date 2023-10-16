package com.kh.operator;

public class Comparison {

	public static void main(String[] args) {
		/*
		 4. �񱳿�����(Comparison) : ���� ���� �� ���
		 - ũ��, ��, ��ȣ �� ���� ������ �� ����
		 - �ΰ��� �� �� ������� ��ū��, ��������, ������, �ٸ����� ���θ� �Ǵ���
		 - �� �������� ��� ���� ��(true) �Ǵ� ����(false)���� ��ȯ
		 - (>) ���� ���� ũ�� ��, �ƴϸ� ������ ��ȯ ex) num > 5;
		 - (<) ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex) num <5;
		 - (>=) ���� ���� ������ �׺��� ũ�ų� ������ ��, �ƴϸ� ������ ��ȯ ex) num >= 5;
		 - (<=) ���� ���� ������ �׺��� �۰ų� ������ ��, �ƴϸ� ������ ��ȯ ex) num <= 5;
		 - (==) �� ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex) num == 5;
		 - (!=) �� ���� ���� �ٸ��� ��, �ƴϸ� ������ ��ȯ ex) num != 5;
		 */
		
		int p = 5;
		int q = 10;
		
		System.out.println("bollean�� ���� ���� : " + (p==q));
		
		boolean isEqual = (p == q);
		System.out.println("p == q : " + isEqual); //p�� q�� ���� ���� �ʱ� ������ false (5 == 10)
		
		int r = 5;
		System.out.println("p == r : " + (p == r)); //p�� r�� ���� ���� ������ true (5 == 5)
		
		boolean isEqual1 = (p != q);
		System.out.println("p != q : " + isEqual1); //p�� q�� ���� �ٸ��� ������ ������ true (5 != 10)
		
		boolean isEqual2 = (p != r);
		System.out.println("p != r : " + isEqual2); //p�� r�� ���� ���� ������ ������ false (5 != 5) 
	}

}
