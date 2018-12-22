package com.decorator.pizza;

public class Margherita extends Pizza {

	public Margherita() {
		this.setDescription("Margherita");
	}

	@Override
	public double getCost() {
		return 20;
	}

}
