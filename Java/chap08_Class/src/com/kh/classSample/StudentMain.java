package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		
		Student student1 = new Student("��â��",25,"3�г�");
		Student student2 = new Student("ȫ�浿",28,"6�г�");
		Student student3 = new Student("�谳��",23,"1�г�");
		Student student4 = new Student("ö ��",27,"5�г�");
		// �л� ���� ���
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	}

}
