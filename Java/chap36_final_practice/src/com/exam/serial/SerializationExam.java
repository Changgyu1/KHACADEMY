package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) throws ClassNotFoundException {
		PersonSerial ps = new PersonSerial("ȫ�浿", 20);
		// ��ü�� ����ȭ ���Ͽ� ����
		try {
			FileOutputStream fileOut = new FileOutputStream("PersonSerial.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(ps);
			out.close();
			fileOut.close();
			System.out.println("PersonSerial ��ü�� ����ȭ�Ǿ� PersonSerial.txt ���Ͽ� �����");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ���Ͽ��� ��ü�� ������ȭ�Ͽ� �о��
		try {
			FileInputStream fileIn = new FileInputStream("PersonSerial.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("PersonSerial.txt ���Ͽ��� ��ü�� ������ȭ �Ͽ����ϴ�.");
			System.out.println("������ȭ�� ��ü ���� : " + deSerialPerson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
