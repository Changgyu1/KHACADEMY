package com.kh.operator;

public class Logical {

	public static void main(String[] args) {
		/*
		 5. ��������(Logical)
		 - �� �����ڴ� ������ ������ �ٷ� �� ����Ѵ�.
		 - &&(�� AND), ||(�� OR), !(�� NOT)
		 - &&(����) �� ���� ��� ���� ��� ��, �ƴϸ� ����
		 - ex) boolean val = (5 > 2) && (5 > 3);  // true
		 - ||(����) �� �� �� �ϳ��� ���̶� ���̸� ��
		 - ex) boolean val = (5 > 2) || (5 < 3);  // alse
		 - !(������) ���� ���� �������� �ٲٰ�, ������ ���� ������ �ٲ�
		 - ex) boolean val = !(5 > 2);  // false
		 - ex) boolean val = !(5 < 2);  // true
		 */
		
		//1. &&(�� AND)
		boolean isTrue = true;
		boolean isFalse = false;
		boolean logicalAnd = isTrue && isFalse;
		System.out.println("logicalAnd(&&) : " + logicalAnd);
		boolean val1 = (5 > 2) && (5 > 3);
		System.out.println("val1(&&) : " + val1);
		
		int a = 10;
		int b = 5;
		int c = 3;
	  //boolean val2 = (10 > 5) && (10 > 3);
		boolean val2 = (a > b) && (a > c);
		System.out.println("val2(&&) : " + val2);
	  //boolean val3 = (10 > 5) && (10 < 3);
		boolean val3 = (a > b) && (a < c);
		System.out.println("val3(&&) : " + val3);
		
		//2. ||(�� OR)
		boolean val4 = (5 > 2) || (5 < 3);
		System.out.println("val4(||) : " + val4);
		
		int d = 20;
		int e = 10;
		int f = 5;
	  //boolean val5 = (20 > 10) || (20 < 5);
		boolean val5 = (d > e) || (d < f);
		System.out.println("val5(||) : " + val5);
	  //boolean val6 = (20 < 10) || (20 < 5);
		boolean val6 = (d < e) || (d < f);
		System.out.println("val6(||) : " + val6);
		
		//3. !(�� NOT)
		boolean val7 = !(5 > 2);
		System.out.println("val7(!) : " + val7);
		
		int g = 100;
		int h = 200;
		int i = 100;
	  //boolean val8 = !(100 > 200);
		boolean val8 = !(g > h);
		System.out.println("val8(!) : " + val8);
		
		boolean val9 = !(g > i);
		System.out.println("val9(!) : " + val9);
	}

}
