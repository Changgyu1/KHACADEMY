package com.kh.Instance.tv;

public class Tv {
	// TV ����
	// TV �Ӽ�(�ʵ�)
	String color;  // TV ����
	boolean power; // ���� ����
	int channel;   // ä��
	// TV ���(�޼���)
	public void power() {
		power = !power; // ���� ����
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
}
