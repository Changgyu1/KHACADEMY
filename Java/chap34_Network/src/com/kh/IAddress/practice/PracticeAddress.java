package com.kh.IAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.youtube.com");
			System.out.println("Host Address : " + address.getHostAddress());
			
			InetAddress[] alladdress = InetAddress.getAllByName("www.youtube.com");
			System.out.println("유튜브에 지정된 모든 호스트의 아이피 주소를 배열로 얻음");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
