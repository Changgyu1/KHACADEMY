package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();
		PlayerCharacter player2 = new PlayerCharacter();
		
		
		player1.setName("�̼���");			
		player1.setHealth(100);				
		player1.setAttackerPower(10);	
		
		player1.displayInfo();	
		
		player2.setName("ȫ�浿");			
		player2.setHealth(100);				
		player2.setAttackerPower(5);
		
		player2.displayInfo();
		
		System.out.println("Attack!!!!  ��");
		
		player1.attack(player2);
		
	
		
		
		
	}

}
