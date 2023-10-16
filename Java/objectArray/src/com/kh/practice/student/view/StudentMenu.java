package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController con = new StudentController();
	
	public StudentMenu() {
		System.out.println("==========학생 정보 출력==========");
		Student[] pstar = con.printStudent();
		for(int a = 0; a < pstar.length; a++) {
			System.out.println(pstar[a].inform());
		}
		
		System.out.println("==========학생 성적 출력==========");
		double[] astar = con.avgScore();
		System.out.println("학생 점수 합계 : " + (int) astar[0]);
		System.out.println("학생 점수 평균 : " + astar[1]);

		System.out.println("==========성적 결과 출력==========");
		for (int a = 0; a < pstar.length; a++) {
			if (pstar[a].getScore() < con.getCUT_LINE()) {
				System.out.println(pstar[a].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(pstar[a].getName() + "학생은 통과입니다.");
			}
		}

	}
}
