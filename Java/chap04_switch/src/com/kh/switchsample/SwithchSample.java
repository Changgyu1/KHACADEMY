package com.kh.switchsample;

public class SwithchSample {

	public static void main(String[] args) {
		
		/*

		- Switch��
		- Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		  switch ���� �Ϸ��� case ���� �ش� ���� ���Ͽ� 
		  ��ġ�ϴ� ��� �ش��ϴ� �ڵ� ����� ����
		  �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		  
		  switch (���� �Ǵ� ǥ����) {
		  	cash ��1 :
		  		//��1�� �ش��ϴ� �ڵ�
				break; //�ش� ����� ������ �ߴ��ϴ� ����
		  	cash ��2 :
		  		//��2�� �ش��ϴ� �ڵ�
		  		break; //�ش� ����� ������ �ߴ��ϴ� ����
		  	default :
		  		//�� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		}
		  
		 */
		
		int day = 30;
		switch (day) {
			case 1:  //case�� 30�̸� ������ ��� false
				System.out.println("������"); // ��µ��� ����
				break;
				
			case 2:
				System.out.println("ȭ����");
				break;
				
			case 30:
				System.out.println("������");
				break;
				
			default :
				System.out.println("�ָ�");
				
		}
		
		int choice = 1;
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("ī�� �󶧸� �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("��� ����Ƽ�� �ֹ��ϼ̽��ϴ�.");
				break;
			default :
				System.out.println("�߸��� �ֹ��Դϴ�. �ٽ� �����Ͽ� �ּ���!");
		}
		
	}

}
