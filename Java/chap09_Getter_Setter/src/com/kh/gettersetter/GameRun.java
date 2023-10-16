package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		PlayerCharacter player2 = new PlayerCharacter();
		
		
		player1.setName("이순신");			
		player1.setHealth(100);				
		player1.setAttackerPower(10);	
		
		player1.displayInfo();	
		
		player2.setName("홍길동");			
		player2.setHealth(100);				
		player2.setAttackerPower(5);
		
		player2.displayInfo();
		
		System.out.println("Attack!!!!  후");
		
		player1.attack(player2);
		
	
		
		
		
	}

}
