package com.kh.Instance.americano;
//�⺻ �Ƹ޸�ī��
public class Americano {
	private int size; //�Ƹ޸�ī�� ������
	private boolean hasSugar; // ���� ����
	
	public Americano(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�.");
		System.out.println("ũ�� : " + size);
		if (hasSugar) { // true 
		System.out.println("������ �߰��մϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
}
