package com.kh.ThreadPractice;

import java.io.IOException;

public class GameMain {

		public static void main(String[] args) {
			//외부 클래스의 인스턴스를 생성
			GameLoop lo = new GameLoop();
			
			Thread thr = new Thread(new GameLoop());
			
			thr.start();
			
			try {
				System.in.read();
				
				lo.setGameLoop(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
}
}
