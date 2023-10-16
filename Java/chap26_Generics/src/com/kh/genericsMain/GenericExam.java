package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(42000);
		intBook.put(10275);
		
		int intValue = intBook.get(); // 형 변환 필요없음
		
		// 문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("aaaa");
		strBook.put("ccc");
		String strValue = strBook.get(); // 형 변환 할 필요 없음
		
		// 제너릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수 있고
		// 출력 할 수 있음
		System.out.println("Int value : " + intValue);
		System.out.println("String value : " + strValue);

	}

}
