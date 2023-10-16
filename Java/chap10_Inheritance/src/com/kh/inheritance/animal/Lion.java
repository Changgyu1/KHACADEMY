package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}

	public void run() {
		System.out.println(getName() + "는 달리지만 느리다");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "는 먹이가 없어서 못먹고있다.");
	}
	
	public void sleep() {
		System.out.println(getName() + "나무에서 잡니다");
	}
}
