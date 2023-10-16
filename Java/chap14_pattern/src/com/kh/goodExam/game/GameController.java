package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	// private int a;  >> �ν��Ͻ� ����
	//        String b; : ���� ����
	private GameModel model; // ���� ����
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		//���� �����ϴ� ���� �Է�����

		//boolean isTrue = false;
		while (true) { // false�� �� �� ���� �ݺ�
			view.displayGuessPromt();
			int guess = sc.nextInt();
			// ���࿡ ��ǻ�Ͱ� ������ ���ڸ� �������� �ҷ��� view
			if (model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				//isTrue = true;
				break;
			} else {
				// ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAttempts());
				System.out.println(model.getSecretNumber());
				//isTrue = false;
			}
		}
		view.displayGameOver();
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
		
		c.runGame();
	}
	
}
