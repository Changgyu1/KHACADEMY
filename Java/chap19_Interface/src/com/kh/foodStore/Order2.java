package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

public class Order2 implements FoodStore{
	private List<Menu> Order2Menu;
	public Order2() {
		Order2Menu = new ArrayList<>();
	}
	
	
	
	
	@Override
	public void addMenu(String menu) {
		Menu menu2 = new Menu(menu);
		Order2Menu.add(menu2);
	}

	@Override
	public void removeMenu(String menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printMenu() {
		System.out.println("=== �ֹ����� ===");
		for(Menu menu2 : Order2Menu) {
			System.out.println(menu2.getItem());
		}
		
	}
//�ֹ� ��ü2 ����ϴ� ���� ����
}
