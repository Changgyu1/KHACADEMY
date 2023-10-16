package com.kh.hw.person.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name,age,height,weight);
		this.salary = salary;
		this.dept = dept;
	}
/*
- salary : int		// 급여
- dept : String		// 부서
+ Employee()
+ Employee(name:String, age:int, height:double, weight:double, salary:int, dept:String)
+ getter/setter()
+ toString() : String

+Employee()
기본 생성자
+Employee(name:String, age:int, height:double, weight:double, salary:int, dept:String)
매개변수 생성자 
+getter/setter()
필드 값을 반환하고 대입하는 메소드
+toString():String
각 필드 반환 메소드

*/

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " 급여 : " + salary + " 부서 : " + dept;
	}
}
