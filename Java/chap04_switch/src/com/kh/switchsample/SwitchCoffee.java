package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {
 
	public static void main(String[] args) {
		//while���� Ȱ���� switch
		
		Scanner sc = new Scanner(System.in);
		
		int coffee;
		boolean DeCoffee = false; // while �� false �� �� ������ ���� , true �� �� ����
		
		while (!DeCoffee) { // ������ ���� ���� �ڵ� ����� �ݺ������� ����
			System.out.println("Ŀ�Ǹ� ������ �ּ���!");
			System.out.println("1�� �Ƹ޸�ī�� 2�� ī��� 3�� ȫ��");
			coffee = sc.nextInt();
			
			switch (coffee) {
				case 1:
					System.out.println("�Ƹ޸�ī�� �ֹ�");
					DeCoffee = true;
					break;
				case 2:
					System.out.println("ī��� �ֹ�");
					DeCoffee = true;
					break;
				case 3:
					System.out.println("ȫ�� �ֹ�");
					DeCoffee = true;
					break;
				default :
					System.out.println("�߸��� �����Դϴ�. �ٽ��ֹ� ���ּ���!");
			
			}
		}
		
	}

}
