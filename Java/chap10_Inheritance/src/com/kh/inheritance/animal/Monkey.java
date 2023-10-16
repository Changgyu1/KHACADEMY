package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName() + "는 두발로 달린다");
	}
	@Override // 한번더 재정 해준다(구분)
	public void eat() {
		System.out.println(getName() + "는 바나나를 먹는다");
	}
}
