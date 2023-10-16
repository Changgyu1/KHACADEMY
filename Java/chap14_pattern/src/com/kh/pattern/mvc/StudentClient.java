package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {
	/*
	MVC ������ ����ؼ� �л� ������ �ٷ�°�
	*/
	public static void main(String[] args) {
		//�𵨰�ü ���� Model
		StudentModel model = new StudentModel("ȫ�浿", 10);
		//��ü ���� view 
		StudentView view = new StudentView();
		//��Ʈ�ѷ� ��ü ���� Controller (�� �� ����)
		StudentController controller = new StudentController(model, view);
		//�л� ������ ������Ʈ�ؼ� ���
		controller.updataView();
		//�л� ������ ������Ʈ ����!
		controller.setStudentName("�浿");
		controller.setStudentAge(17);
		//������Ʈ �� �л� ������ ���
		controller.updataView();
	}

}
