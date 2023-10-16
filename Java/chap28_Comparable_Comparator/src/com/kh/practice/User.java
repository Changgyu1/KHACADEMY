package com.kh.practice;
//ComparExam -> User Student Actor

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.Comparable.Person;

public class User implements Comparable<User>{
	String name;
	int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(User otherUser) {
		
		return this.age - otherUser.age;
	}
	
	@Override
	public String toString() {
		return "UserName = " + name + " UserAge = " + age;
	}
	
	public static void main(String[] args) {
		List<User> user = new ArrayList<>();
		user.add(new User("�л�1", 78));
		user.add(new User("�л�2", 79));
		user.add(new User("�л�3", 71));
		
		//Comparator ����
		Collections.sort(user);
		//���̸� �������� ����
		for(User User : user) {
			System.out.println(User);
		}
	}

}
