package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) {
		InetAddressMain idm = new InetAddressMain();
		idm.InetExam();
		idm.InetSample();
	}

	public void InetExam() {
		try {
			// ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.naver.com");

			// IP �ּ� ���
			System.out.println("Hos Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());

			// ���� ȣ��Ʈ�� InetAddress ��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Addressz : " + localHost.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void InetSample() {
		// ȣ��Ʈ�̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			// IP �ּҸ� byte �迭�� ���
			// InetAddress ��ü���� IP �ּҸ� ����Ʈ �迭�� ����
			// IP �ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP �ּҸ� �ٷ�� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes�� ���� ");
			for( byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			
			System.out.println();
			
			// ������ �� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
			System.out.println();
			
			// ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			// ���� ȣ��Ʈ�� IP �ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Address : " + localHost.getHostAddress());
			
			// ��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽ ĳ��Ʈ �ּ��Դϱ�? : " + isMultiCast);
			
			// ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP �ּ� �̸� : " + name.getHostAddress());
			
			// ȣ��Ʈ ������ �̸� ��������(��ü ������ �̸�)
			// ȣ��Ʈ�� ����ȭ�� (FQDN) �������� �̸��� ����
			// FQDN : Full Qualified Domain Name
			String hostFullName = name.getCanonicalHostName();
			System.out.println("Ǯ���� : " + hostFullName);
			
			// LookPask �ּ� ���� Ȯ��
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("�����ΰ���? : " + isLookPack);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
