package com.factory.pizza.level2;

public class ChicagoPizzaStore extends PizzaStore {
	Pizza pizza;

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("pepporoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;

	}

}
