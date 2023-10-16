package com.kh.junit.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	// 배열을 멤버변수로 선언
	private int[] arr;
	private int size;
	private String[] arrs = {"월", "화", "수", "목", "금", "토", "일"};
/*	
	public ArrayPractice(int size) {
		arr = new int[size];
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i + 1; 
		}
	}
	
	public int[] practice1() {
		//arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i + 1; 
		}
		return arr;
	}
	
	public int[] getArray() {
		return arr;
	}
	*/
	public String[] getArrs() {
		return arrs;
	}
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	

	public ArrayPractice(int size) {

		if(size >= 0 && size <= 6) {
			System.out.println(arrs[size]);
		}
	}
	
	public String[] practice2() {
		return arrs;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

