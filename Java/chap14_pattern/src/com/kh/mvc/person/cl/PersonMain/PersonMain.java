package com.kh.mvc.person.cl.PersonMain;

import com.kh.mvc.person.co.PersonController.PersonController;
import com.kh.mvc.person.mo.PersonModel.PersonModel;
import com.kh.mvc.person.vo.PersonView.PersonView;

public class PersonMain {

	public static void main(String[] args) {
		
		//모델 객체 생성
		PersonModel permodel = new PersonModel("김개똥",4,"잠자기");
		//뷰 객체 생성
		PersonView perview = new PersonView();
		//컨트롤러 객체 생성 및 모델 뷰 설정
		PersonController contro = new PersonController(permodel, perview);
		//학생 정보를 업데이트해서 출력
		contro.updata();
		//학생 정보 업데이트
		contro.setName("");
		contro.setAge(999);
		contro.setHobby("천국가기");
		contro.setisVaild();
		
		System.out.println("");
		//업데이트 된 학생 정보 출력 
		contro.updata();
	}

}
