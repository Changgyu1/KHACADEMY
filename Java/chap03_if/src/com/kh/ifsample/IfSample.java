package com.kh.ifsample;

public class IfSample {

	public static void main(String[] args) {
		/*
		- ���ǹ�
		- if, else if, else ���� ������ ����ؼ� ���ǿ� ���� �ٸ� �ڵ� ��� ����
		- �־��� ������ ���ϰ�, 
		- ���� ��� Ư�� �ڵ� ����, ������ ��� �ٸ� �ڵ� ����
		- if(���ǹ�{
			��(true)�̸� ����
		  }else{
		  	   ����(false)�̸� ����
		  }
		*/

		int money = 300;
		if (money >= 200) {
			//true
			System.out.println("������ ����~");
		}else {
			System.out.println("��Ǭ�ݼ�~");
		}
		
		int age = 18;
		if (age >= 18) {
			System.out.println("�����Դϴ�.");
		}
		
		int temp = 25;
		if (temp > 24) {
			System.out.println("������ ����Ʈ�ϱ� ���� �����Դϴ�~");	
		}
		System.out.println("�̻��Դϴ�.");
	}

}
