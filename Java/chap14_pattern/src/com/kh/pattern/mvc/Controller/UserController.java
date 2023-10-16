package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {
	/*
	 * 모델과 뷰를 연결하는곳 사용자 입력을 처리하는 곳
	 */
	private UserModel usermodel;
	private UserView userview;

	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}

	public void setUserName(String Name) {
		usermodel.setName(Name);
	}

	public void setUserAge(int Age) {
		usermodel.setAge(Age);
	}

	public int getUserAge() {
		return usermodel.getAge();
	}

	public String getUserName() {
		return usermodel.getName();
	}

	public void setUserview(UserView userview) {
		this.userview = userview;
	}

	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}
	public UserModel getUsermodel() {
		return usermodel;
	}



	public UserView getUserview() {
		return userview;
	}
	
	public void updataView() {
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}

}