package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		Product product1 = new Product("�ĵ�Ƽ", 15000, "����Ű");
		product1.information();
		
		Product product2 = new Product("����", 30000, "����");
		product2.information();
		
		Product product3 = new Product("����", 23000, "�Ƶ�ٽ�");
		product3.information();
		
	}

}
