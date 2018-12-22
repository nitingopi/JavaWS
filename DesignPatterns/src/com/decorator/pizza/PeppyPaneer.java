package com.decorator.pizza;

public class PeppyPaneer extends Pizza {

	public PeppyPaneer() {
		this.setDescription("PeppyPaneer");
	}

	@Override
	public double getCost() {

		return 60;
	}

}
