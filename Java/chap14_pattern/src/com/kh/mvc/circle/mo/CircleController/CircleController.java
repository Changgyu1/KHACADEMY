package com.kh.mvc.circle.mo.CircleController;

import com.kh.mvc.circle.mo.CircleModel.CircleModel;
import com.kh.mvc.circle.mo.CircleView.CircleView;

public class CircleController {
	private CircleModel circlemodel;
	private CircleView circleview;

	public CircleController(CircleModel circlemodel, CircleView circleview) {
		this.circlemodel = circlemodel;
		this.circleview = circleview;
	}

	public void setNumber(int number) {
		circlemodel.setNumber(number);
	}

	public void setPI(double PI) {
		circlemodel.setPI(PI);
	}

	public int getNumber() {
		return circlemodel.getNumber();
	}

	public double getPI() {
		return circlemodel.getPI();
	}

	public void setCircleview(CircleView circleview) {
		this.circleview = circleview;
	}

	public void setCirclemodel(CircleModel circlemodel) {
		this.circlemodel = circlemodel;
	}

	public CircleModel getCirclemodel() {
		return circlemodel;
	}

	public CircleView getCircleview() {
		return circleview;
	}
	public void updata() {
		circleview.displayResult(circlemodel.getNumber(), circlemodel.getPI());
	}

}
