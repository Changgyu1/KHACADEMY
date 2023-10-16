package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy pc = new PracticeCopy();
		pc.practiceCopy2();
		//pc.practiceCopy1();
		// 이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후
		// 바탕화면에다가 폴더를 만들어서
		// 폴더 안에 복사한 이미지 저장하기

	}

	public void practiceCopy1() {
		String inputF = "C:\\Users\\user1\\Desktop\\해달.png";
		String outputF = "C:\\Users\\user1\\Desktop\\해달최고~.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputF);
				FileOutputStream fos = new FileOutputStream(outputF)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
				
			}
			System.out.println("파일 복사되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void practiceCopy2() {
		String inputFile = "C:\\Users\\user1\\Desktop\\apap.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\열지마세요!\\진짜열지마세요!\\진짜진짜열지마세요\\마지막입니다\\열지마세요!!\\열지말라고!\\마지막이다 돌아가";
		String outputFile = newFolder+"\\"+"퍼큐.jpg";
		File folder = new File(newFolder);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
