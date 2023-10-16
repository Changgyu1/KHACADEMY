package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

��Ʈ��ũ ����� ���� �߿��� Ŭ����
UDP(User datagram Protocol) ����ؼ� �����͸� �ۼ��� �ϴµ� ���
DatagramSocket
	UDP ����� ���� ���� Ŭ����
	TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ�
		������ ��Ŷ�� �׳� ������ �޴� ����
		
DatagramPacket
	UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
	�������� ���� ����� �����͸� ���� ��� �Ǵ� �����͸� ������ ����� �ּ� ���� ����

	Packet�̶�? ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
			   �����͸� �ְ���� �� ���س��� ��Ģ
			   Pack + bucket �ռ���

*/

public class UDPServer { // UDP ������ ��Ÿ��
	public void start() throws Exception { // start() �� UDP ������ �����ϴ� �޼���, ���ܸ� ���� �� �����Ƿ� ����ó���� �ʿ�
		DatagramSocket socket = new DatagramSocket(8888); // 8888�� ��Ʈ�� ����ϴ� ������ �����ϰ� ������ ���ؼ� UDP ����� �̷����
		DatagramPacket inPacket, outPacket; // inPacket : Ŭ���̾�Ʈ�κ��� �����͸� ������ �� ���  | outPacket : Ŭ���̾�Ʈ���� �����и� ���� �� ���

		byte[] inMsg = new byte[10]; 
		byte[] outMsg;

		while (true) { // while ������ ����ؼ� ������ ����ؼ� ���� , �� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ ��
			
			inPacket = new DatagramPacket(inMsg, inMsg.length);// �����͸� �����ϱ� ���� ��Ŷ�� ����
			
			socket.receive(inPacket);// ��Ŷ�� ���� Ŭ���̾�Ʈ�κ��� �����͸� ���� 
			
			InetAddress address = inPacket.getAddress();// ������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port | inPacket�� ���� Ŭ���̾�Ʈ�� IP �ּҿ� Port��ȣ ���
			int port = inPacket.getPort();
			
			SimpleDateFormat simpleData = new SimpleDateFormat("[hh:mm:ss]");// ������ ���� �ð��� (��, ��, ��) ���·� ��ȯ | ���� ���� �ð��� hh:mm:ss ������ ���ڿ��� ��ȯ
			String time = simpleData.format(new Date());
			outMsg = time.getBytes(); // byte �迭�� ��ȯ
			
			outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);//��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
			
		}
	}
	public static void main(String[] args) {// main �޼��� : UDPServer Ŭ������ �ν��Ͻ��� �����ϰ� start() �޼��带 ȣ���Ͽ� UDP ���� ���� | ���� �߻��ϸ� ���� ó��
		try {
			new UDPServer().start(); // UDP ���� ����
			// new UDPServer.start(); error
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
