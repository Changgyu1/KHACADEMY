package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	public void run() {
		System.out.println(getName() + " 달리자");
	}

	@Override // animal에 적혀있는 eat을 고양이 안에서만 다시 정의를 내린다.
	public void eat() {
		System.out.println(getName() + " 먹이를 뻇는다.");
	}
}
