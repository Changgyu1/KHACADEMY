package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	// private int a;  >> 인스턴스 변수
	//        String b; : 참조 변수
	private GameModel model; // 참조 변수
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//최초 메세지 보여주는거 출력하고
		view.displayMessage();
		//스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);
		
		//숫자 추출하는 값을 입력하자

		//boolean isTrue = false;
		while (true) { // false가 될 때 까지 반복
			view.displayGuessPromt();
			int guess = sc.nextInt();
			// 만약에 컴퓨터가 생각한 숫자를 맞췄을떄 불러올 view
			if (model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				//isTrue = true;
				break;
			} else {
				// 컴퓨터가 생각한 숫자와 내가 입력한 숫자가 틀렸을 때 view
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
