package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		Product product1 = new Product("후드티", 15000, "나이키");
		product1.information();
		
		Product product2 = new Product("자켓", 30000, "보세");
		product2.information();
		
		Product product3 = new Product("바지", 23000, "아디다스");
		product3.information();
		
	}

}
