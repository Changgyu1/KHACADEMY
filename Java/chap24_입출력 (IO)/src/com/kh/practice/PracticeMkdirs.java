package com.kh.practice;

import java.io.File;

public class PracticeMkdirs {

	public static void main(String[] args) {
		PracticeMkdirs pm = new PracticeMkdirs();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();

	}
	
	
	public void Practice1() {
		String dirPath = "C:\\Users\\user1\\Desktop\\중요한파일\\열지마셈";
		
		File dir = new File(dirPath);
		
		boolean su = dir.mkdirs();
		
		if(su) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
	}
	
	public void Practice2() {
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\chap25_";
		
		File dir = new File(dirPath);
		
		boolean su = dir.mkdirs();
		
		if(su) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
	}
	
	public void Practice3() {
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPoP\\Group";
		
		File dir = new File(dirPath);
		
		boolean su = dir.mkdirs();
		
		if(su) {
			System.out.println("폴더 생성 얍~!");
		} else {
			System.out.println("폴더 생성 실패 ㅜㅡㅜ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
