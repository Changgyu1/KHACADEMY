package com.kh.ThreadPractice;

import java.io.IOException;

public class GameMain {

		public static void main(String[] args) {
			//�ܺ� Ŭ������ �ν��Ͻ��� ����
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
