package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {

 		//1. �迭�� ���̸� ����
		int[] num = new int[10]; //���̰� 3�� �迭 ����
 		//1 ~ 10 ������ �ݺ����� �̿��ؼ�
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		System.out.println("");
		//������� �迭 �ε����� ���� �� �� ���� ���
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
//===================================================================================		
		//���̰� 10�� �迭�� ���� 1 ~ 10 ������ ���� �ݺ����� �̿��ؼ� �ߴµ�
		// �������� �迭 �ε����� ���� �� �� ���� ���
		
		for(int i = num.length -1; i >= 0; i--) {
			System.out.println(num[i] + " " + i);
		}
//===================================================================================
		
		int[] numbers = new int[10]; // ���̰� 10�� �迭 ����
		
		//int value = 10;  // numbers.length = 10�̱� ������ 1���� 10���� ���� �������� �迭�� �Ҵ�
		int value = numbers.length;
		//      0      0 < 10              i + 1
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = value--;
			System.out.println("numbers[" + i + "]" + " = " + numbers[i]);
		}
//===================================================================================
		
		//2. ���̰� 5�� String �迭 ����
		//"���" "��" "����" "������" "����" �� �ʱ�ȭ �� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		
		String[] fruit = {"���","��","����","������","����"}; //String �迭 ����
		System.out.println("�迭 �ε��� 1�� �� : " + fruit[1]);
		
		

	}
}

