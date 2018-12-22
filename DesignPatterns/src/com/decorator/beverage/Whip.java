package com.decorator.beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		System.out.println("whip get description");
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		System.out.println("whip cost");
		double cost = beverage.cost();
		Size size = beverage.getSize();
		if (size == Size.TALL) {
			cost += 0.05;
		} else if (size == Size.GRANDE) {
			cost += 0.10;
		} else if (size == Size.VENTI) {
			cost += 0.15;
		}

		return cost;

	}

}
