package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		
		Student student1 = new Student("박창규",25,"3학년");
		Student student2 = new Student("홍길동",28,"6학년");
		Student student3 = new Student("김개똥",23,"1학년");
		Student student4 = new Student("철 구",27,"5학년");
		// 학생 정보 출력
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	}

}
