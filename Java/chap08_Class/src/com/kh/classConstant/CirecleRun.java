package com.kh.classConstant;

import com.kh.classCircle.Circle;

public class CirecleRun {

	public static void main(String[] args) {
		// �⺻������ ��ü ����!
		Circle circle = new Circle();
		
		//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ����غ���!!!
		System.out.println("�ʱ⿡ ���� ������ �˰�ʹ�~");
		//inRadius
		circle.AreaCircle();
		circle.SizeOfCircle();
		//AreaCircle
		//SizeOfCircle
		
		//�������� 1�� ������Ų��.
		circle.increamentRadius();
		
		//���� �ѷ��� ���̰� ������ 1�� ������ ���� ��� ����ϱ�
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaCircle();
		circle.SizeOfCircle();
	}	

}
