package com.kh.ifsample;

public class IfExam {
	
	public static void main(String[] args) {
		/*
		- ��ø if�� or ���� if��
		if (���ǽ�1) {
			if (���ǽ�2) {
				if (���ǽ�3) {
					����� ����;
				} else if (���ǽ�4) {
					����� ����;
				} else {
					����� ����;
				} 
			} else {
				����� ����;
			}
		} else {
			����ɹ���
	}	
		*/
		
		//������ ���� ����!
		int month = 9;
		int temp = -15;
		
		if (month == 1 || month == 2 || month == 12) {  // month�� 1 or 2 or 12 �̸�
			System.out.println("�ܿ�");    // �ܿ� ���
			
			if (temp <= -15) {  // �ܿ� �̰� temp�� -15���� �۰ų� ������
				System.out.println("���� �溸!"); // ���� �溸
				
			} else if (temp <= -12) { // �ܿ��̰� temp�� -15���� �۰� -12���� �۰ų� ������
				System.out.println("���� ����!"); // ���� ����
				
			}
		} else if (month >= 3 && month <= 5) { // month�� 3���� ũ�ų� ���� 5���� �۰ų� ������
			System.out.println("��");   // �� ���
			
		} else if (month >= 6 && month <= 8) { // month�� 6���� ũ�ų� ���� 8���� �۰ų� ������
			System.out.println("����"); //���� ���
			
			if (temp >= 35) { // �����̰� temp�� 35���� ũ�ų� ���� ��
			System.out.println("���� ����"); // ���� ���
			
			} else if (temp >= 33) {  // temp�� 35���� �۰ų� 33���� ũ�ų� ���� ��
				System.out.println("���� ���Ǻ�"); // �������Ǻ� ���
				
			}
		} else if (month >= 9 && month <= 11) { //month�� 9���� ũ�ų� ���� 11���� �۰ų� ������
			System.out.println("����"); // ���� ���
			
		}
		
		
		
		
	}
}
