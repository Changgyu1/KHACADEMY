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
- salary : int		// �޿�
- dept : String		// �μ�
+ Employee()
+ Employee(name:String, age:int, height:double, weight:double, salary:int, dept:String)
+ getter/setter()
+ toString() : String

+Employee()
�⺻ ������
+Employee(name:String, age:int, height:double, weight:double, salary:int, dept:String)
�Ű����� ������ 
+getter/setter()
�ʵ� ���� ��ȯ�ϰ� �����ϴ� �޼ҵ�
+toString():String
�� �ʵ� ��ȯ �޼ҵ�

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
		return super.toString() + " �޿� : " + salary + " �μ� : " + dept;
	}
}
