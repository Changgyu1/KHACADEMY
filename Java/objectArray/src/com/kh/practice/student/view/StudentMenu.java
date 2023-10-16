package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController con = new StudentController();
	
	public StudentMenu() {
		System.out.println("==========�л� ���� ���==========");
		Student[] pstar = con.printStudent();
		for(int a = 0; a < pstar.length; a++) {
			System.out.println(pstar[a].inform());
		}
		
		System.out.println("==========�л� ���� ���==========");
		double[] astar = con.avgScore();
		System.out.println("�л� ���� �հ� : " + (int) astar[0]);
		System.out.println("�л� ���� ��� : " + astar[1]);

		System.out.println("==========���� ��� ���==========");
		for (int a = 0; a < pstar.length; a++) {
			if (pstar[a].getScore() < con.getCUT_LINE()) {
				System.out.println(pstar[a].getName() + "�л��� ����� ����Դϴ�.");
			} else {
				System.out.println(pstar[a].getName() + "�л��� ����Դϴ�.");
			}
		}

	}
}
