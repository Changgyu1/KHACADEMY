package com.kh.calculatorMVC;

public class CalculatorController {
	
	private CalculatorModel model;
	private CalculatorView view;
	
	//생성자 만들기
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		int userInput = view.getUserInput();
		model.setNumber(userInput);
		int result = model.calculateSquare();
		view.displayResult(result);
		//System.out.println(model.calculateSquare());
		//int result = model
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
