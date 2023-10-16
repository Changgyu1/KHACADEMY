package com.kh.IAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.youtube.com");
			System.out.println("Host Address : " + address.getHostAddress());
			
			InetAddress[] alladdress = InetAddress.getAllByName("www.youtube.com");
			System.out.println("��Ʃ�꿡 ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
