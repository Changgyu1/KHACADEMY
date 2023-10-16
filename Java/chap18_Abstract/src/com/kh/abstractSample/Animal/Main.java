package com.kh.abstractSample.Animal;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Dog animal = new Dog("강아지", "왈왈");
		animal.displayName();
		animal.makeSound();
		//1. cat 만들기
		//cat ct = new cat("고양이");
		/*Cat cat = new Cat("고양이", "먀옹");
		cat.displayName();
		cat.makeSound();*/
		Cat[] cat = new Cat[2];
		cat[0] = new Cat("고양이", "야옹");
		cat[1] = new Cat("냥이", "응냥");
		cat[0].displayName();
		cat[0].makeSound();
		cat[1].displayName();
		cat[1].makeSound();
		
		
		//2. 객체배열로 animal 정의해서 출력하기  /  다형성을 활용한 객체 다루기
		//Animal[] animal = new Animal[2];
	}

}
