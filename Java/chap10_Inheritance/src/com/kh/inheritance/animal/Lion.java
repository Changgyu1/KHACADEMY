package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}

	public void run() {
		System.out.println(getName() + "�� �޸����� ������");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "�� ���̰� ��� ���԰��ִ�.");
	}
	
	public void sleep() {
		System.out.println(getName() + "�������� ��ϴ�");
	}
}
