package com.kh.Instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		
		Cafe client1 = new Cafe("�Ƹ޸�ī��", "small", true);
		Cafe client2 = new Cafe("ī��Ḷ���߶�", "big", false);
		Cafe client3 = new Cafe("īǪġ��", "big", true);
		
		client1.makeCafe();
		System.out.println();
		client2.makeCafe();
		System.out.println();
		client3.makeCafe();

	}

}
