package com.kh.ArrayListSample;

public class ArrayList04 {

	public static void main(String[] args) {
		// ���ڿ� �迭�� ����ؼ� 
		//�⼧�� for Loop�� ���ڿ� �迭�� ��� �� 
		//���� �� ���ڿ��� ã�� ����ϱ�
		
		String[] ss = {"apple", "banana", "elderBerry", "cheery"};
		String longss = "";
		
		for(String aa : ss) {
			if(aa.length() > longss.length()) {
				longss = aa;
			}
		}
		System.out.println("longss : " + longss);
	}

}
