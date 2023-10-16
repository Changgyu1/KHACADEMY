package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		GoodPlayer player2 = new GoodPlayer();
		
		player1.setName("");
		player1.isValidName();
		
		player1.setHealth(-10); // -10체력을 저장해주고
		player1.isValidHealth();
		// -10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		
		player1.setAttackPower(-20);
		player1.isValidAttackPower();
		
		player2.setName("이름");
		player2.isValidName();
		
		player2.setHealth(5);
		player2.isValidHealth();
		
		player2.setAttackPower(1);
		player2.isValidAttackPower();
		
		player1.display();
		System.out.println("=================");
		player2.display();

		
		
	
		
		
		
	}

}
