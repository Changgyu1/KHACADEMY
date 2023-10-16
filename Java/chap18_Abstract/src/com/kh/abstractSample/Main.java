package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Red", 5.0);
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle Color : " + circle.getColor());
		//Rectangle r = new Rectangle("Blue",4.0);
		Rectangle rectangle = new Rectangle("BLue", 4.0, 3.0);
		System.out.println("Rectangle Area : " + rectangle.calculateArea());
		System.out.println("Rectangle Color : " + rectangle.getColor());
		
	}

}
