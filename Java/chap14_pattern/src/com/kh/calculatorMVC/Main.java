package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		
		//model, view controller
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController contro = new CalculatorController(model, view);
		
		contro.run();
		
		
		
		
		
		
		
		

	}

}
