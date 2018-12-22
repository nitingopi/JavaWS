package com.decorator.beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.description + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		Size size = beverage.getSize();
		if (size == Size.TALL) {
			cost += 0.15;
		} else if (size == Size.GRANDE) {
			cost += 0.20;
		} else if (size == Size.VENTI) {
			cost += 0.25;
		}

		return cost;

	}

}
