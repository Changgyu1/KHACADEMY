package com.kh.ThreadMain;

public class StudentThread extends Thread{
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
	}
	@Override
	public void run() {
		System.out.println(studentName + "가(이) 공부를 시작합니다.");
		try {
			Thread.sleep(2000);  // 스레드가 2초당안 잠자기 상태로 있도록 합니다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	

}
