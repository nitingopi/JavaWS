package com.decorator.pizza;

public class Barbeque extends ToppingsDecorator {
	Pizza pizza;

	public Barbeque(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " Barbeque";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 35;
	}

}
