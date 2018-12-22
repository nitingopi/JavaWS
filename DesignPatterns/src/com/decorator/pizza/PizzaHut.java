package com.decorator.pizza;

public class PizzaHut {

	public static void main(String[] args) {
		Pizza pizza = new Margherita();
		pizza = new FreshTomato(pizza);
		pizza = new FreshTomato(pizza);

		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());

		// make chicken+barbeque2+freshtomato

		Pizza chickenPizza = new ChickenFiesta();
		chickenPizza = new Barbeque(chickenPizza);
		chickenPizza = new FreshTomato(chickenPizza);

		System.out.println(chickenPizza.getDescription());
		System.out.println(chickenPizza.getCost());

		Pizza chickenPizza2 = new FreshTomato(new Barbeque(new ChickenFiesta()));
		System.out.println(chickenPizza2.getDescription());
		System.out.println(chickenPizza2.getCost());

	}

}
