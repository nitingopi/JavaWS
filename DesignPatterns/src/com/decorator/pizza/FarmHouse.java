package com.decorator.pizza;

public class FarmHouse extends Pizza {

	public FarmHouse() {
		this.setDescription("FarmHouse");
	}

	@Override
	public double getCost() {
		return 75;
	}

}
