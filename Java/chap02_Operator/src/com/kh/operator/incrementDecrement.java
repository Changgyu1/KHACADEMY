package com.kh.operator;

public class incrementDecrement {

	public static void main(String[] args) {
		// 3. ����������(Increment & Decrement)
		/* ���������ڴ� ������ ���� 1�� ������Ű�ų� ���ҽ�ų �� ����Ѵ�.
		 ���� ���� ������(++x, --x) ���� ���� ������(x++, x--)
		 1-1) ���� ���� ������
		  ++ ���� ���� 1�� ���Ѵ�.
		  val = ++num;//num�� ���� 1������ �� val ������ ����
		  -- ���� ���� 1�� ����.
		  val = --num;//num�� ���� 1������ �� val ������ ����.
		  
		*/
		//���� ���� ������
		int val, val2;
		int num1 = 10;
		val = ++num1; //num�� ���� 1������ �� val ������ ������ �ϱ� ������ 11�� ���Ե�
		System.out.println(val);
		
		val2 = --num1;//num�� ���� 1 ������ �� val ������ ������ �ϱ� ������ 10�� ���Ե�
		System.out.println(val2);
		
		//���� ���� ������
		int val3, val4;
		int num2 = 10;
		System.out.println("num2�� �� : " + num2);
		val3 = num2++; // val3 ������ ���� num2 ���� ������ �� num ���� 1 ������
		//1�� val3 = num2 �� �߰�����
		//2�� num2 ++ 1 �߰����� = num2 = 11
		System.out.println("var3 : " + val3);
		System.out.println("num2�� �� : " + num2);
		
		val4 = num2--;
		System.out.println("var4 : " + val4);
		System.out.println("num2 : " + num2);
		
		 
		  
		  
		  
	

	}

}
