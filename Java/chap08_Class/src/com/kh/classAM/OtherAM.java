package com.kh.classAM;

public class OtherAM {
	public static void main(String[] args) {
		//AM 생성
		AM am = new AM(); 
		
		am.defaultMethod();
		am.protectedMethod();
		am.publicMethod();
		//am.privateMethod();  :  다른 클래스에 존재하기 때문에 출력이 안됨
	}
}
