package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		GoodPlayer player2 = new GoodPlayer();
		
		player1.setName("");
		player1.isValidName();
		
		player1.setHealth(-10); // -10ü���� �������ְ�
		player1.isValidHealth();
		// -10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)���� �����Ѵ�.
		
		player1.setAttackPower(-20);
		player1.isValidAttackPower();
		
		player2.setName("�̸�");
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
