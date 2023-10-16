package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		// Object Ŭ������ ����
		
		// ��ü ����
		Object obj = new Object();
		Object obj2 = new Object();
		
		// equals() �޼Ҹ� ����ؼ� �� ��ü ��
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj�� obj2�� ������? : " + isEqual);
		
		// hashCode() �޼ҵ带 ����Ͽ� ��ü�� �ؽ� �ڵ� ���
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj�� �ؽ��ڵ� : " + hashcode1);
		System.out.println("obj2�� �ؽ��ڵ� : " + hashcode2);
		
		// toString() �޼ҵ带 ����Ͽ� ��ü�� ���ڿ��� ǥ��
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj�� ���ڿ� ǥ�� : " + objString);
		System.out.println("obj2�� ���ڿ� ǥ�� : " + obj2String);
		
		// getClass() �޼ҵ带 ����Ͽ� ��ü�� Ŭ���� ���� ���
		Class<?> classofobj1 = obj.getClass();
		Class<?> classofobj2 = obj2.getClass();
		System.out.println("obj Ŭ���� : " + classofobj1.getName());
		System.out.println("obj2 Ŭ���� : " + classofobj2.getName());
		
		
		
		
	}

}
