package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 main = new PracticeMain2();
		main.practice1();
		main.practice2();
		main.practice3();
		main.practice4();
		main.practice5();
		
	}
	
	public void practice1() {
		// ���ڿ� �� ���̱� ��� append Ȱ��
		StringBuffer sb = new StringBuffer();
		sb.append("���� ���� �� �� �� ��~");
		System.out.println("practice1 : " + sb.toString());
		sb.append("������ ������~");
		System.out.println("practice1 : " + sb.toString());
	}
	
	public void practice2() {
		//���ڿ� ������ reverse
		String str = "���� ������ ������?";
		StringBuffer stra = new StringBuffer(str);
		stra.reverse();
		System.out.println("practice2 : " + stra.toString());
	}

	public void practice3() {
		// ���ڿ� ���� inser ? ����
		String str = "���� ������ ������?";
		StringBuffer stra = new StringBuffer(str);
		stra.insert(1, "����");
		System.out.println("practice3 : " + stra.toString());
	}
	
	public void practice4() {
		//���ڿ� ��ü replace(, ,);
		String str = "���� ������ ������?";
		StringBuffer stra = new StringBuffer(str);
		stra.replace(1, 7, "*");
		System.out.println("practice4 : " + stra.toString());
	}
	
	public void practice5() {
		//���ڿ� ���� delete (,,);
		String str = "���� ������ ������?";
		StringBuffer stra = new StringBuffer(str);
		stra.delete(0, 7);
		System.out.println("practice5 : " + stra.toString());
	}
	
	
	
	
}
