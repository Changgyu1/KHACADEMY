package com.kh.example.practice2.model.vo;

public class Product {  
	//1. ������� ����
	String pName;
	int price;
	String brand;
	
	public Product(String pName, int price, String brand) {
		// 2. ������ this�� Ȱ���ؼ� �����
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
	}
	public void information() {
		// sysout + ctrl + space => �ڵ��ϼ�
		//3. ���� ��� �޼ҵ� �����
		System.out.println("��ǰ�� : " + pName);
		System.out.println("�� �� : " + price);
		System.out.println("�귣�� : " + brand);
	    System.out.println();
		
	}
}
