package com.kh.hw.person.run;

import com.kh.hw.person.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student st = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템 공학과");
		
		System.out.println("학생 이름 : " + st.getName());
		System.out.println("나  이 : " + st.getAge());
		System.out.println("  키 : " + st.getHeight());
		System.out.println("몸무게 : " + st.getWeight());
		System.out.println("급 여 : " + st.getGrade());
		System.out.println("부 서 : " + st.getMajor());
		
	}
}
