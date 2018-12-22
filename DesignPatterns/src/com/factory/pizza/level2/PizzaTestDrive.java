package com.factory.pizza.level2;

public class PizzaTestDrive {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("veggie");
		pizza.getName();
		Pizza pizza2 = nyStore.orderPizza("cheese");
		pizza2.getName();

		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza pizza3 = chicagoStore.orderPizza("veggie");
		pizza3.getName();

	}

}
