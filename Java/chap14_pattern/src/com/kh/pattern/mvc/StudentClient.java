package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {
	/*
	MVC 패턴을 사용해서 학생 정보를 다루는곳
	*/
	public static void main(String[] args) {
		//모델객체 생성 Model
		StudentModel model = new StudentModel("홍길동", 10);
		//객체 생성 view 
		StudentView view = new StudentView();
		//컨트롤러 객체 생성 Controller (모델 뷰 설정)
		StudentController controller = new StudentController(model, view);
		//학생 정보를 업데이트해서 출력
		controller.updataView();
		//학생 정보를 업데이트 하자!
		controller.setStudentName("길동");
		controller.setStudentAge(17);
		//업데이트 된 학생 정보를 출력
		controller.updataView();
	}

}
