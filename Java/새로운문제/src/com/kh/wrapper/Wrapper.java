package com.kh.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		Wrapper wrapper = new Wrapper();
		wrapper.Wrapper1();
	}

	public void Wrapper1() {
		byte a = Byte.parseByte("1");
		short b = Short.parseShort("2");
		int c = Integer.parseInt("3");
		long e = Long.parseLong("4");
		float f = Float.parseFloat("0.1");
		double g = Double.parseDouble("0.2");
		boolean h = Boolean.parseBoolean("true");
		
		char i = "abc".charAt(0);
		
		System.out.println("byte : " + a + " short : " + b + " int : " + c);
		System.out.println("long : " + e + " float : " + f + " double : " + g);
		System.out.println("boolean : " + h);
	}
	
	public void Wrapper2() {
		
	}
	
	
	
	
}
