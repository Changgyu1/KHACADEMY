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

	public void practice1() { //��μ����ؼ� ���� �����
		final String wpath = "C:\\\\Users\\\\user1\\\\Desktop//���ϰ�μ���.txt";
		try {
			FileWriter w = new FileWriter(wpath);
			//���� ����
			w.write("���ϰ�μ���\n�Ƶ�! �߸��������~");
			//���� �ݱ�
			w.close();
			
			//��� �б�
			
			//������ : ��� ������ ��ΰ� Ȯ���� ���
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
