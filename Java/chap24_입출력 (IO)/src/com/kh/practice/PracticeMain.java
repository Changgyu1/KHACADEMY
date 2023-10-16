package com.kh.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pw = new PracticeMain();
		pw.practice1();
	}

	public void practice1() { //경로설정해서 파일 만들기
		final String wpath = "C:\\\\Users\\\\user1\\\\Desktop//파일경로설정.txt";
		try {
			FileWriter w = new FileWriter(wpath);
			//파일 쓰기
			w.write("파일경로설정\n아따! 잘만들어졌네~");
			//파일 닫기
			w.close();
			
			//경로 읽기
			
			//절대경로 : 어디서 보던지 경로가 확실한 경로
			FileReader reader = new FileReader(wpath);
			BufferedReader buff = new BufferedReader(reader);
			String line;
			while((line = buff.readLine()) != null) {
				System.out.println(line);
			}
			buff.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
