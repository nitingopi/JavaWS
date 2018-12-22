package com.factory.pizza.level2;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for (String topping : toppings) {
			System.out.println("  " + topping);
		}
	}

	public void bake() {
		System.out.println("Bake for 25 min at 350");
	}

	public void cut() {
		System.out.println("Cuting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza into official PizzaStore box");
	}

	public String getName() {
		return name;
	}

}
