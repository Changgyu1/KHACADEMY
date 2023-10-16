package com.kh.abstractSample.Animal;

abstract class Animal {
	//�ʵ� S name;
	private String name;
	
	//������
	public Animal(String name) {
		this.name = name;
	}
	
	public void setAnimal(String name) {
		this.name = name;
	}
	
	public String getAnimal() {
		return name;
	}
	
	//�߻�޼��� �����Ҹ� ��� void makeSound();
	//abstract String makeSound();
	public abstract void makeSound();
	//�Ϲ� �޼��� ���� �̸� ��� void displayName();
	public void displayName() {
		System.out.println("�����̸� : " + name);
	}
	
	
}
