package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) throws ClassNotFoundException {
		PersonSerial ps = new PersonSerial("홍길동", 20);
		// 객체를 직렬화 파일에 저장
		try {
			FileOutputStream fileOut = new FileOutputStream("PersonSerial.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(ps);
			out.close();
			fileOut.close();
			System.out.println("PersonSerial 객체가 직렬화되어 PersonSerial.txt 파일에 저장됨");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 파일에서 객체를 역직렬화하여 읽어옴
		try {
			FileInputStream fileIn = new FileInputStream("PersonSerial.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("PersonSerial.txt 파일에서 객체를 역직렬화 하였습니다.");
			System.out.println("역직렬화된 객체 정보 : " + deSerialPerson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
