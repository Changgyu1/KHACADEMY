package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		food.add("햄버거");
		food.add("피자");
		food.add("치킨");
		food.add("닭강정");
		food.add("만두");
		food.add("족발");
		
		Iterator<String> ite = food.iterator();
		
		while(ite.hasNext()) {
			String ab = ite.next();
			
			System.out.print(ab + ", ");
		}
		System.out.println();
		System.out.println("iterator 삭제 후 출력");
		//Iterator를 사용하여 요소 삭제
		ite = food.iterator(); // 다시 Iterator 초기화
		
		while(ite.hasNext()) {
			String ab = ite.next();
			//만약에 트로트가 들어오면 삭제하길 원함
			if(ab.equals("치킨")) {
				ite.remove();
			} else {
				System.out.print(ab + ", ");
			}
		}
		System.out.println();
		System.out.println("삭제 후 출력");
		for(String a : food) {
			System.out.print(a + ", ");
		}
		
	}

}
