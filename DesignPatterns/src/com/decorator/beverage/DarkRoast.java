package com.decorator.beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast coffee";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
