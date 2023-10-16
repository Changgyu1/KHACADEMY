package com.kh.example.Practice5.model.vo;

public class Lotto {
	int[] lotto = new int[6];
	
	public Lotto() {
		//��ȣ ����
		for(int i = 0; i < 6; i++) { // 6�ڸ� ��ȣ ����
			lotto[i] = (int)(Math.random() * 45) + 1; // 1���� 45���� ��ȣ ����
			//�ߺ� ��ȣ ����
			for (int j = 0; j < i; j++) { 
				if(lotto[i] == lotto[j]) {
					i--; //���� ���ڰ� ������ �ٽ� ���ش�
					break;
				}
			}
		
		}
		
	}
	
	public void information() {
		//���
		System.out.println("�ζ� ��ȣ");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}
