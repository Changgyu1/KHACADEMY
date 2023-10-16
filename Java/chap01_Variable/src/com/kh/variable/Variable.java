package com.kh.variable;
/*
 */

public class Variable {
	public static void main(String[] args) {
		// 1. ������ �̸��� ������, ����, ������ھ�(_), �޷�($)�θ� ������ �� �ִ�.
		
		// 2. ������ �̸��� ���ڷ� ������ �� ����.
		// ex) int 1abc = 3;   X   int abc1 = 3;  O
		
		// 3. ���� �̸� ���̿��� ������ ������ �� ����.
		// ex) int a b c = 1;  ����� �� ����  
		//����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ������ ������� �ʴ´�.
		
		// 4. �ڹٿ��� �̸� ������ ���� �����̸����� ������� ���Ѵ�.
		// ex) int int = 1;  ����� �� ����
		
		
		
		//1. �Ǽ��� (�Ҽ����� �ִ� ���� : float, double)
		float pie1 = 3.141332123213213f; // float�� �ڿ��� f�� �빮�� F�� �ۼ����ش�.
		double pie2 = 3.141332123213213;
		System.out.print("float : ");
		System.out.println(pie1);
		
		System.out.print("double : ");
		System.out.println(pie2);
		
		//2. ������
		//byte : �̴� -128 ~ 127 ���� ��밡��
		//byte bt = -129; //int�� �����ϰų� ���� byte + byte �� �־���� �Ѵ�.
		byte bt = 127;  //-129�� 128 �̻���� ����� ���� �ʴ� �� Ȯ��
		System.out.println(bt);
		
		//short : �̴� -32,768 ~ 32,767 ���� ��밡��
		//short shrt = -32769; //-32769�� 32768 ���� ��µ��� ����
		short shrt = -32767;
		System.out.println(shrt);
		
		//int : �̴� -2,147,483,648 ~ 2,147,483,647 ���� ��� ����
		//int it = -2147483649; // -2,147,483,648�� 2,147,483,647 ���� ��µ��� ����
		int it = -2147483648;
		System.out.println(it);
		
		//long : �̴� -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		//long lg = -9223372036854775809; // -9,223,372,036,854,775,808�� 9,223,372,036,854,775,807 ���� ��µ��� ����
		long lg = 2000L; //�ڿ� L, l�� �ٿ��ش�.
		System.out.println(lg);
		
		//3. ������
		//char : ������ ���ڸ� �ѱ��ڸ� ������ �� ����
		//       ''�� ����� �� ����
		char chr1 = 'a';
		System.out.println(chr1);
		
		//String�� �⺻���� �ڷ��� ������ ������ �⺻������ ����
		//�⺻���� �ڷ����� ���� �ʱ� ������ (�빮��S)String���� ǥ����
		//String ""�� ''�ȿ� ���ڸ� �ۼ��� ��
		String name = "�ȳ��ϼ���.";
		System.out.println(name);
		
		//4. ����
		//boolean : �̴� true�� false �� ǥ���Ѵ�.
		//����� boolean bln = true; or false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
		String name1 = "ȫ�浿";
		System.out.println("�ȳ��ϼ���. ���� " + name1 + "�Դϴ�.");
		//�ѹ� Ÿ���� ������ ������ �缱���� ���� �ʰ� �״�� ����ص� �ȴ�.
		//�ѹ� ������ Ÿ���� �ٸ� Ÿ������ �缱�� �� �� ����.
		//������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ������ �� ����.
		name1 = "��ö��";
		System.out.println("�ȳ��ϼ���. ���� " + name1 + "�Դϴ�." );
		
		int age = 25;
		String baseball = "�߱�";
		System.out.println("�ȳ��ϼ���. ���� " + name1 + "�Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �̰�, ");
		System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
	
		char score = 'A';
		System.out.println("���� ������ " + score + "�Դϴ�.");
	}
}
