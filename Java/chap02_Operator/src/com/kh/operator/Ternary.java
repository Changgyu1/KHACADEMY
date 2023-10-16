package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		/*
		6. ���� ������(Ternary)
		- ���� = ���� ? ���� : ����
		- ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ��
		- ���� ? ��1 : ��2 ���·� ���
		- ���� ? ��1(=true): ��2(false)
		- �� 1�� ������ ���� �� ���
		- �� 2�� ������ ������ �� ���
		- ex) ���̰� 20�̻��� �����ΰ� �̼������ΰ�?
		- int age = 20;
		-             =     ����     ?  ��1  :   ��2    ���·� ���
		-             =     ����     ?  ��1(ture)  :   ��2(false)
		- String satus = (age >= 20) ? "����" : "�̼�����";
		*/
		
		int age = 20;
		String satus = (age >= 20) ? "����" : "�̼�����";
		System.out.println("status(?) : " + satus);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println("���� ��� : " + result);
		
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign : " + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println("������ ���� : " + weather);
		
		//���� 7�� ���� ¦������ Ȧ������ ���
		
		int A = 7;
		//   7�� ������ ������(%) ���� 1�̰�
		//               1 == 0 // false �̱⋚���� Ȧ����.
		String As = (A % 2 == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println("���� 7�� : " + As);
		
		int number2 = -5;
		String sign1 = (number2 > 0) ? "���" : (number < 0) ? "����" : "0";
		System.out.println("������ ��ȣ : " + sign1);
		
		System.out.println();
		
		
	}

}
