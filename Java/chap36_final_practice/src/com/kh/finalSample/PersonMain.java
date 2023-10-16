package com.kh.finalSample;

public class PersonMain {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[1];
		
		pArr[0] = new Person("kh");
		
		for(int i = 0; i <= pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}

	}

}
