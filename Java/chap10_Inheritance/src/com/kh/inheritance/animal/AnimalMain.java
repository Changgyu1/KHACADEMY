package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("뽀비");
		myDog.info();
		myDog.speak();
		myDog.eat();

		Cat mycat = new Cat("고양이");
		mycat.info();
		mycat.run();
		mycat.eat();
		
		Lion mylion = new Lion("사자");
		mylion.info();
		mylion.run();
		mylion.eat();
		mylion.sleep();
		
		Monkey mymonkey = new Monkey("원숭이");
		mymonkey.info();
		mymonkey.run();
		mymonkey.eat();

	}

}
