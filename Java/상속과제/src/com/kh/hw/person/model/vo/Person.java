package com.kh.hw.person.model.vo;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return "이름 : " + name + " 나이 : " + age + " 키 : " + height + " 몸무게 : " + weight;
		
	}
	


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
/*
- name : String
- age : int 
- height : double
- weight : double
+ Person()
+ Person(name:String, age:int, height:double, weight:double)
+ getter/setter()
+ toString() : String

+Person()
기본 생성자
+Person(name:String, age:int, height:double, weight:double)
매개변수 생성자
+getter/setter()
필드 값을 반환하고 대입하는 메소드
+toString():String
각 필드 반환 메소드

*/


}
