package com.kh.mvc.person.mo.PersonModel;

public class PersonModel {
	private String name;
	private int age;
	private String hobby;

	public PersonModel(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getHobby() {
		return hobby;
	}
	public String isVaild() {
		if(name == null) {
			return name = "이름을 적어주세요!";
		}
		return name;
	}

}
