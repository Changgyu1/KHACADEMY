package com.kh.Instance.cafe;

public class Cafe {

	private String type; // ���� ����
	private String size; // ���� ������
	private boolean isSug; // ���� ����

	public Cafe(String type, String size, boolean isSug) {
		this.type = type;
		this.size = size;
		this.isSug = isSug;
	}

	public void makeCafe() {
		if (size == "big") {
			if (isSug) {
				System.out.println("�������� : " + type);
				System.out.println("��������� : " + size);
				System.out.println("������ �߰��մϴ�");
			} else {
				System.out.println("�������� : " + type);
				System.out.println("��������� : " + size);
			}
		} else if (size == "small") {
			if (isSug) {
				System.out.println("�������� : " + type);
				System.out.println("��������� : " + size);
				System.out.println("������ �߰��մϴ�");
			} else {
				System.out.println("�������� : " + type);
				System.out.println("��������� : " + size);
			}

		}

	}
}
