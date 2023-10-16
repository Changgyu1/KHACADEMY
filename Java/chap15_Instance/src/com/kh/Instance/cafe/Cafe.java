package com.kh.Instance.cafe;

public class Cafe {

	private String type; // 음료 종류
	private String size; // 음료 사이즈
	private boolean isSug; // 설탕 여부

	public Cafe(String type, String size, boolean isSug) {
		this.type = type;
		this.size = size;
		this.isSug = isSug;
	}

	public void makeCafe() {
		if (size == "big") {
			if (isSug) {
				System.out.println("음료종류 : " + type);
				System.out.println("음료사이즈 : " + size);
				System.out.println("설탕을 추가합니다");
			} else {
				System.out.println("음료종류 : " + type);
				System.out.println("음료사이즈 : " + size);
			}
		} else if (size == "small") {
			if (isSug) {
				System.out.println("음료종류 : " + type);
				System.out.println("음료사이즈 : " + size);
				System.out.println("설탕을 추가합니다");
			} else {
				System.out.println("음료종류 : " + type);
				System.out.println("음료사이즈 : " + size);
			}

		}

	}
}
