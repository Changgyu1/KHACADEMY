package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	//extends
	private String sound;
	//������ super
	public Dog(String name, String sound) {
		super(name);
		this.sound = sound;
	}
	@Override
	public void makeSound() {
		System.out.println("�Ҹ� : " + sound);
		
	}
	//public String makeSound(){
		//return sound;
//  }
	//@Override
}
