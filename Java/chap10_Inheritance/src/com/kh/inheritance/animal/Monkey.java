package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName() + "�� �ι߷� �޸���");
	}
	@Override // �ѹ��� ���� ���ش�(����)
	public void eat() {
		System.out.println(getName() + "�� �ٳ����� �Դ´�");
	}
}
