package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�Ǻ�");
		myDog.info();
		myDog.speak();
		myDog.eat();

		Cat mycat = new Cat("�����");
		mycat.info();
		mycat.run();
		mycat.eat();
		
		Lion mylion = new Lion("����");
		mylion.info();
		mylion.run();
		mylion.eat();
		mylion.sleep();
		
		Monkey mymonkey = new Monkey("������");
		mymonkey.info();
		mymonkey.run();
		mymonkey.eat();

	}

}
