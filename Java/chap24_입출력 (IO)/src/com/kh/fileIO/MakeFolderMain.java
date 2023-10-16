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
		// ������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop//��������";
		// ���� �����
		
		File folder = new File(folderPath);
		// exists �̹� �����ϴ��� Ȯ��
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
			
	
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\��������//��������.jpg");
			w.write("�ȳ��ϼ���");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void makeFolder2() {
		//������ ����� ���� �ȿ� ������ �����
		//���� �ȿ� ���� �ۼ��ϱ�
		// window : \
		// Linux or MacOs : /

		final String folder1 = "C:\\Users\\user1\\Desktop\\��������\\�������";
		File folder = new File(folder1);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}

		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\��������\\�������\\����.avi");
			w.write("�������ƾƾƾ�");
			w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
