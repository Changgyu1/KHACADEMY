package com.kh.classSample;

public class Car {
	// 1. ���� �ʵ� �������
	String brand;       //�귣��
	String model;      // ��
	int speed;        // �ӵ�
	boolean engineOn;//���� ����
/* ===============================================
 *  ������� �ؿ��� ��� �޼���� ����
 */
	// 2. �����ڴ� �޼����� �Ѱ��� ����
	public Car(String brand, String model) {  // ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
		System.out.println("�귣�� : " + brand + " �� : " + model);
	}
	public void startEngine(boolean engineOn) { // ���� ���� �޼���
		if(engineOn) { // ���࿡ ������ true ���� �õ�
			System.out.println("������ �õ��մϴ�."); // ��� �޼ҵ� �ۼ�
		} else { // ������ false �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�."); // ��� �޼ҵ� �ۼ�
		}
	}
		public void acclerate(int amount) { // ���� �޼���
			if (engineOn) { //������ true��
				System.out.println("�ӵ�" + amount + "�Դϴ�"); //�ӵ��� �󸶴�.
			} else { // ������ false��
				System.out.println("�ӵ��� �� �� ����");  // ������ ���� �־� �ӵ��� �� �� ����.
			}
		}
	
}
