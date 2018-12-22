package com.decorator.pizza;

public class Paneer extends ToppingsDecorator {
	Pizza pizza;

	public Paneer(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " Paneer";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 14;
	}

}
