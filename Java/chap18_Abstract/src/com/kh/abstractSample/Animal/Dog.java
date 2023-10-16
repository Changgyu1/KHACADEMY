package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	//extends
	private String sound;
	//持失切 super
	public Dog(String name, String sound) {
		super(name);
		this.sound = sound;
	}
	@Override
	public void makeSound() {
		System.out.println("社軒 : " + sound);
		
	}
	//public String makeSound(){
		//return sound;
//  }
	//@Override
}
