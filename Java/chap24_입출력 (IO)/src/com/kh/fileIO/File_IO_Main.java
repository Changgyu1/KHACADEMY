package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); // ����
			writer.write("���� ���� ��մ�."); //���� ����
			writer.write("\n���� ���� ��մ�.����");
			writer.close(); // ���� �ȿ� ������ �� ���� �ݱ�
			
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferReader.close(); // ������ �� ������ �ݾ��ֱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}

/*
//���࿡ ��¥�� ���� ��¥�� ������ ������
//������ �����
String filePath = "���� ���� ��/�����IO.txt";
//FileWriter fWriter = new FileWriter(filePath,true);
//true : ���� ���� �̾��
//false : ���� �����
File f = new File("newFile.txt"); //new File("���" , "����.txt); >> �ش��ο� ���ϻ���
								  //new File("����.txt); >> ������ ������Ʈ�� ����
try {
	if(f.createNewFile()) {
		System.out.println("������ �����մϴ�.");
	}else {
		System.out.println("������ �̹� �����մϴ�.");
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