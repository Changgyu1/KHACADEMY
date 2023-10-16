package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	public void information() {
		System.out.println("이 름 : " + pName);
		System.out.println("가 격 : " + price);
		System.out.println("브랜드 : " + brand);
		
	}
}

