package com.kh.ThreadMain;

public class ThreadMain extends Thread{
/*
Thread 
	���μ��� ������ ����Ǵ� �������� ���� �帧
	��Ƽ�������� ���� ���� �۾��� ������ �� �ְ� ��
*/
	
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("������ ������ : " + i);
		}
		try {
			Thread.sleep(1000); // 1�� ���� ������ �Ͻ�����
			System.out.println("������ �������ϱ�?");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();
		
		thread1.run();
		thread2.run();
		
		// main �����忡�� �ٸ� �۾��� ������ �� ����
		
		try {
			thread1.join(); //therad1�� ����� �� ���� ���
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��� ������ ����");
	}

}