package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class GameLoop  implements Runnable { 
	private static boolean gameLoop = false;


	@Override
	public void run() {
		while (!isGameLoop()) {
			int randomValue = new Random().nextInt(30);
			System.out.println("������ ���� : " + randomValue);
			try {
				Thread.sleep(750);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("������ �����Ϸ��� Enter �����ּ���");
		}

	}


	public static boolean isGameLoop() {
		return gameLoop;
	}


	public static void setGameLoop(boolean gameLoop) {
		GameLoop.gameLoop = gameLoop;
	}



}
