package com.kh.abstractSample.Animal;

abstract class Animal {
	//필드 S name;
	private String name;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	public void setAnimal(String name) {
		this.name = name;
	}
	
	public String getAnimal() {
		return name;
	}
	
	//추상메서드 동물소리 출력 void makeSound();
	//abstract String makeSound();
	public abstract void makeSound();
	//일반 메서드 동물 이름 출력 void displayName();
	public void displayName() {
		System.out.println("동물이름 : " + name);
	}
	
	
}
