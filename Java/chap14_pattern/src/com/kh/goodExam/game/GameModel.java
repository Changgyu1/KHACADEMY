package com.kh.goodExam.game;
// ���� ���ڸ��߱� ���� ��
public class GameModel {
	private int secretNumber; // ������ ��ȣ
	private int attempts;     // ��� �õ��ߴ°�
	
	public GameModel() {
		secretNumber = (int) (Math.random() * 100) + 1; // 1 ~ 100 ������ ������ ���� �����ϱ�
		attempts = 0; //���ʽõ� 0 ��
		
	}
	//1���� 100���� �� ��ǻ�Ͱ� �������� ������ ���� 1��
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts ++;
	}
	
	public boolean inCorrectGuess(int guess) {
		incrementApttempts();//guess�� ���� �Է��߱� ������ ���� �޼ҵ带 �߰�
		return guess == secretNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
