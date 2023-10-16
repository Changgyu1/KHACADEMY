package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42000);
		intBook.put(10275);
		
		int intValue = intBook.get(); // �� ��ȯ �ʿ����
		
		// ���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("aaaa");
		strBook.put("ccc");
		String strValue = strBook.get(); // �� ��ȯ �� �ʿ� ����
		
		// ���ʸ� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� �� �ְ�
		// ��� �� �� ����
		System.out.println("Int value : " + intValue);
		System.out.println("String value : " + strValue);

	}

}
