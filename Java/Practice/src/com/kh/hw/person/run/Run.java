package com.kh.hw.person.run;

import com.kh.hw.person.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student st = new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��� ���а�");
		
		System.out.println("�л� �̸� : " + st.getName());
		System.out.println("��  �� : " + st.getAge());
		System.out.println("  Ű : " + st.getHeight());
		System.out.println("������ : " + st.getWeight());
		System.out.println("�� �� : " + st.getGrade());
		System.out.println("�� �� : " + st.getMajor());
		
	}
}
