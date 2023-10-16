package com.kh.hw.person.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
	}
/*
- grade : int		// 학년
- major : String		// 전공
+ Student()
+ Student(name:String, age:int, height:double, weight:double, grade:int, major:String)
+ getter/setter()
+ toString() : String

+Student() 
기본 생성자
+Student(name:String, age:int, height:double, weight:double, grade:int, major:String)
매개변수 생성자 
+getter/setter()
필드 값을 반환하고 대입하는 메소드
+toString():String
각 필드 반환 메소드


*/

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + " 학년 : " + grade + " 전공 : " + major;
	}

}
