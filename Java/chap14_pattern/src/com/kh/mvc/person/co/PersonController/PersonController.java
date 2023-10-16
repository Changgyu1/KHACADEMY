package com.kh.mvc.person.co.PersonController;

import com.kh.mvc.person.mo.PersonModel.PersonModel;
import com.kh.mvc.person.vo.PersonView.PersonView;

public class PersonController {

	private PersonModel model;
	private PersonView view;

	public PersonController(PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}

	public PersonModel getModel() {
		return model;
	}

	public void setModel(PersonModel model) {
		this.model = model;
	}

	public PersonView getView() {
		return view;
	}

	public void setView(PersonView view) {
		this.view = view;
	}

	public String getName() {
		return model.getName();
	}
	public String getisVaild() {
		return model.isVaild();
	}
	
	public void setisVaild() {
		model.isVaild();
	}

	public int getAge() {
		return model.getAge();
	}

	public String getHobby() {
		return model.getHobby();
	}

	public void setName(String name) {
		model.setName(name);
	}

	public void setAge(int Age) {
		model.setAge(Age);
	}

	public void setHobby(String hobby) {
		model.setHobby(hobby);
	}
	
	public void updata() {
		view.displayInfo(model.getName(), getAge(), getHobby());
	}

}
