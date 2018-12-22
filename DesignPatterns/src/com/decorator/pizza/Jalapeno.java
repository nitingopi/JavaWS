package com.decorator.pizza;

public class Jalapeno extends ToppingsDecorator {

	Pizza pizza;

	public Jalapeno(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {

		return pizza.getDescription() + " Jalapeno";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 25;
	}

}
