package com.kh.practice10;

public class Practice10 {

	public static void main(String[] args) {
		
		//1. �ֹι�ȣ �����
		String jumin = "123456-1234567";

		//2. �����ڸ� ���� ��ǥ ����°� �����
		String makeStar = "*";
		
		//3. �ֹι�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		// to char Array�� ����ؼ� String -> char Array �� ����
		char[] juminStar = jumin.toCharArray(); // {'1','2','3','4','5','6','-','1','','3','4','5','6','7'}
		
		for(int i = 8; i <= 13; i++) {
			juminStar[i] = '*';
			
		}
		System.out.print(juminStar);
	}

}
