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
		user.add(new User("학생1", 78));
		user.add(new User("학생2", 79));
		user.add(new User("학생3", 71));
		
		//Comparator 정리
		Collections.sort(user);
		//나이를 기준으로 정렬
		for(User User : user) {
			System.out.println(User);
		}
	}

}
