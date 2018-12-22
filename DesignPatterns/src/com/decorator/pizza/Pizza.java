package com.decorator.pizza;

public abstract class Pizza {
	private String description;
	private String name;
	private double cost;

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String getName() {
		return name;
	}

	public abstract double getCost();

}
