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
		// �̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
		// ����ȭ�鿡�ٰ� ������ ����
		// ���� �ȿ� ������ �̹��� �����ϱ�

	}

	public void practiceCopy1() {
		String inputF = "C:\\Users\\user1\\Desktop\\�ش�.png";
		String outputF = "C:\\Users\\user1\\Desktop\\�ش��ְ�~.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputF);
				FileOutputStream fos = new FileOutputStream(outputF)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
				
			}
			System.out.println("���� ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void practiceCopy2() {
		String inputFile = "C:\\Users\\user1\\Desktop\\apap.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\����������!\\��¥����������!\\��¥��¥����������\\�������Դϴ�\\����������!!\\���������!\\�������̴� ���ư�";
		String outputFile = newFolder+"\\"+"��ť.jpg";
		File folder = new File(newFolder);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
