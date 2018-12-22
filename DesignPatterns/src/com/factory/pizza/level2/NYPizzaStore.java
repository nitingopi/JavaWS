package com.factory.pizza.level2;

public class NYPizzaStore extends PizzaStore {

	Pizza pizza;

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}

		return pizza;
	}

}
