package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	public void run() {
		System.out.println(getName() + " �޸���");
	}

	@Override // animal�� �����ִ� eat�� ����� �ȿ����� �ٽ� ���Ǹ� ������.
	public void eat() {
		System.out.println(getName() + " ���̸� �P�´�.");
	}
}
