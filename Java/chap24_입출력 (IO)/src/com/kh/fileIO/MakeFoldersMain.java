package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {
/*

mkdirs
����ȭ�� / kh / image
�θ� ���丮�� �������� �ʴ� ��쿡 �߰� ��� ���丮 ����

*/
	public static void main(String[] args) {
		String dirPath = "C:\\Users\\user1\\Desktop\\����������!\\��¥����������!\\��¥��¥����������\\�������Դϴ�\\����������!!\\���������!\\�������̴� ���ư�";
		
		//file ��ü ����
		File dir = new File(dirPath);
		
		//mkdirs �޼��带 ����ؿ� ���丮 ���� �õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����");
		}

	}

}
