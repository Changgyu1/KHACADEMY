package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		MakeFolderMain mfm = new MakeFolderMain();
		
		mfm.makeFolder1();
		mfm.makeFolder2();
		//mfm.makeFolder3();

	}
	
	public void makeFolder1() {
		// 폴더를 생성할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop//직빡구리";
		// 폴더 만들기
		
		File folder = new File(folderPath);
		// exists 이미 존재하는지 확인
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성 되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
			
	
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\직빡구리//열지마셈.jpg");
			w.write("안녕하세요");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void makeFolder2() {
		//폴더를 만들고 폴더 안에 파일을 만들기
		//파일 안에 내용 작성하기
		// window : \
		// Linux or MacOs : /

		final String folder1 = "C:\\Users\\user1\\Desktop\\직빡구리\\열어보지마";
		File folder = new File(folder1);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성 되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}

		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\직빡구리\\열어보지마\\직빡.avi");
			w.write("열지마아아아아");
			w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
