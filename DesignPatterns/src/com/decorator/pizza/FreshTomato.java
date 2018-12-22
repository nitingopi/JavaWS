package com.decorator.pizza;

public class FreshTomato extends ToppingsDecorator {

	Pizza pizza;

	public FreshTomato(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {

		return pizza.getDescription() + " FreshTomato";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 10;
	}

}
