package com.kh.Instance.tv;

public class Tv {
	// TV 제작
	// TV 속성(필드)
	String color;  // TV 색상
	boolean power; // 전원 상태
	int channel;   // 채널
	// TV 기능(메서드)
	public void power() {
		power = !power; // 전원 상태
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
}
