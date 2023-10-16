package com.kh.example.snack;

public class Snack {
	private String kind, name, flavor; // ����, �̸�, ��
	private int numOf, price; // ����, ����
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public void information() {
		System.out.println("���� : " + kind);
		System.out.println("�̸� : " + name);
		System.out.println(" �� : " + flavor);
		System.out.println("���� : " + numOf);
		System.out.println("���� : " + price);
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}