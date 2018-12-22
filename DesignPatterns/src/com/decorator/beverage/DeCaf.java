package com.decorator.beverage;

public class DeCaf extends Beverage {

	public DeCaf() {
		description = "De Caf coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
