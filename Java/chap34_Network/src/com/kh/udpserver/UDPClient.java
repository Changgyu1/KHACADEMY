package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient { // UDP ���� Ŭ����
	
	public void start() throws Exception { // start() UDP ������ �����ϴ� �޼��� ����ó�� �ʿ�
		DatagramSocket dataSocket = new DatagramSocket(); // ������ ���� , UDP ����� �̷���
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1"); // ������ �����ϱ� ���� ������ ���� | 127.0.0.1 = localhost Ŭ���̾�Ʈ�� 
		                                                         //������ ���� ��ǻ�Ϳ��� ���� ���� ������ ���� | ��Ʈ��ȣ ������ server���� �����ϰ�, �������� ������ ��Ʈ�� ��
											//All�� ������ Ȯ��
		byte[] msg = new byte[200];// �����Ͱ� ����� ������ ������ ������ ũ��� byte �迭 ����
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,8888); // ������ �����͸� ������ ���� ����
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length); // �����κ��� �����͸� �����ϱ� ���� ����
		
		dataSocket.send(outPacket);// DatagramPacket�� ����
		
		dataSocket.receive(inPacket);// DatagramPacket�� ����
		
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));// ���ŵ� �����͸� ���ڿ��� ��ȯ�Ͽ� ������ ����ð��� ���
		
		dataSocket.close(); // Ŭ���̾�Ʈ�� ������ �ݾ� ������ ����
		
	}
	public static void main(String[] args) throws Exception {
		new UDPClient().start();
	}
	
}
