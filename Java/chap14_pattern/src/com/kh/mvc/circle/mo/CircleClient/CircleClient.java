package com.kh.mvc.circle.mo.CircleClient;

import com.kh.mvc.circle.mo.CircleController.CircleController;
import com.kh.mvc.circle.mo.CircleModel.CircleModel;
import com.kh.mvc.circle.mo.CircleView.CircleView;

public class CircleClient {

	public static void main(String[] args) {
		//모델 객체 생성
		CircleModel model = new CircleModel(1,7.7);
		//뷰 객체 생성
		CircleView view = new CircleView();
		//컨트롤러 객체 생성 및 모델 뷰 설정
		CircleController contro = new CircleController(model, view);
		//학생 정보를 업데이트해서 출력
		contro.updata();
		//학생 정보 업데이트
		contro.setNumber(7);
		contro.setPI(6.73);
		//업데이트 된 학생 정보 출력 
		contro.updata();
		

	}

}
