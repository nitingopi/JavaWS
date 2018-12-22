package com.decorator.pizza;

public class ChickenFiesta extends Pizza {

	public ChickenFiesta() {
		this.setDescription("Chicken Fiesta");
	}

	@Override
	public double getCost() {
		return 65;
	}

}
