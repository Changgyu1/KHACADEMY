package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); // 생성
			writer.write("영어 공부 재밌다."); //파일 쓰기
			writer.write("\n영어 공부 재밌다.헤헤");
			writer.close(); // 파일 안에 내용을 다 쓰면 닫기
			
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferReader.close(); // 파일을 다 읽으면 닫아주기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}

/*
//만약에 날짜가 오늘 날짜인 폴더가 없을때
//폴더를 만들고
String filePath = "설명 적는 란/입출력IO.txt";
//FileWriter fWriter = new FileWriter(filePath,true);
//true : 파일 끝에 이어쓰기
//false : 파일 덮어쓰기
File f = new File("newFile.txt"); //new File("경로" , "파일.txt); >> 해당경로에 파일생성
								  //new File("파일.txt); >> 실행한 프로젝트에 생성
try {
	if(f.createNewFile()) {
		System.out.println("파일을 생성합니다.");
	}else {
		System.out.println("파일이 이미 존재합니다.");
	}
	//FileWriter fw = new FileWriter(f);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

String fileName = f.getName();
System.out.println(fileName);
//FileReader fReader = new FileReader(f, true);
*/