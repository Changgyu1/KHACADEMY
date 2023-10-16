package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class GameLoop  implements Runnable { 
	private static boolean gameLoop = false;


	@Override
	public void run() {
		while (!isGameLoop()) {
			int randomValue = new Random().nextInt(30);
			System.out.println("임이의 숫자 : " + randomValue);
			try {
				Thread.sleep(750);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("게임을 종료하려면 Enter 눌러주세요");
		}

	}


	public static boolean isGameLoop() {
		return gameLoop;
	}


	public static void setGameLoop(boolean gameLoop) {
		GameLoop.gameLoop = gameLoop;
	}



}
