package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order();
		order.addMenu("Â«»Í ÁÖ¹®");
		order.addMenu("Â¥Àå¸é ÁÖ¹®");
		order.addMenu("ÅÁ¼öÀ° ÁÖ¹®");
		order.printMenu();
		
		FoodStore order2 = new Order2();
		order2.addMenu("ÇÜ¹ö°Å~");
		order2.addMenu("¹ä¹ö°Å~");
		order2.printMenu();
	}

}
