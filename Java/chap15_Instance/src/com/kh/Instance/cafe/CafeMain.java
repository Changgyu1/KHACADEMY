package com.kh.Instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		
		Cafe client1 = new Cafe("¾Æ¸Þ¸®Ä«³ë", "small", true);
		Cafe client2 = new Cafe("Ä«¶ó¸á¸¶³¢¾ß¶Ç", "big", false);
		Cafe client3 = new Cafe("Ä«ÇªÄ¡³ë", "big", true);
		
		client1.makeCafe();
		System.out.println();
		client2.makeCafe();
		System.out.println();
		client3.makeCafe();

	}

}
