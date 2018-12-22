package com.decorator.beverage;

public class Espresso extends Beverage {

	public Espresso() {
		System.out.println("espresso get description");
		description = "Espresso";
	}

	@Override
	public double cost() {
		System.out.println("espresso cost");
		return 1.99;
	}

}
