package com.kh.tcpMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) throws IOException {
		

			// ���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
			// ���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ���
			Socket socket = new Socket("localhost", 6789);
			System.out.println("[ Server Connect ]");
			
			// ���� �� �ڵ�
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("HIHIHIHIHI SESESESESE VERVERVERVER");
			printStream.flush();
			
			// �����κ��� �о��
			InputStream InStream = socket.getInputStream();
			Scanner sc = new Scanner(InStream);
			System.out.println("[ Client ] Server : " + sc.nextLine());
			
			socket.close();
			System.out.println("Bye Server~ = �ٽ� ������~");
	
		
	
	}
}
