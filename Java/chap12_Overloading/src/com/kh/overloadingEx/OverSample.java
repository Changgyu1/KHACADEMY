package com.kh.overloadingEx;

public class OverSample {

	// 2°³ÀÇ µ¡¼À
	public int sum(int a, int b) {
		return a + b;
	}

	// 3°³ÀÇ °ö¼À
	public int sum(int a, int b, int c) {
		return a * b * c;
	}

	// a*b + c*d °öÇÏ°í ´õÇÏ±â
	public int sum(int a, int b, int c, int d) {
		return (a * b) + (c * d);
	}

	// ½Ç¼ö 2°³ °öÇÏ±â
	public double sum(double a, double b) {
		return a * b;
	}

	// ½Ç¼ö °öÇÏ°í ³ª´©±â
	public double sum(double a, double b, double c) {
		return a * b / c;
	}

	public static void main(String[] args) {

		OverSample ob = new OverSample();

		System.out.println("µÎ °³ÀÇ Á¤¼ö µ¡¼À : " + ob.sum(10, 7));
		System.out.println("¼¼ °³ÀÇ Á¤¼ö °ö¼À : " + ob.sum(10, 7, 2));
		System.out.println("(µÎ°³°ö) (/) (µÎ°³°ö) Á¤¼ö : " + ob.sum(10, 7, 5, 4));
		System.out.println("µÎ °³ÀÇ ½Ç¼ö °ö¼À : " + ob.sum(10.27, 7.3));
		System.out.println("¼¼ °³ÀÇ ½Ç¼ö °öÇÏ°í ³ª´©±â : " + ob.sum(10.4, 7.25, 5.17));

	}

}
