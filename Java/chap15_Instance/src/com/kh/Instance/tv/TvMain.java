package com.kh.Instance.tv;

public class TvMain {

	public static void main(String[] args) {
		Tv tv; // Tv�ν��Ͻ��� �����ϱ� ���ؼ� ���� tv ����
		tv = new Tv(); // Tv�ν��Ͻ� ����   ��ü�� �ּҸ� ���������� ����
		//Tv tv1 = new Tv();
		tv.channel = 7;  // Tv �ν��Ͻ��� ������� channel�� ���� 7�� ����
		tv.channelDown(); // Tv �ν��Ͻ��� �ż��� channelDown�� ȣ��
		tv.power();
		System.out.println("Power  : " + tv.power + " " + tv);
		System.out.println("Channel : " + tv.channel);
	}

}
