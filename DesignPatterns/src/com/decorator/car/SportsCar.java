package com.decorator.car;

public class SportsCar extends CarDecorator {
	Car car;

	public SportsCar(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("....Now Sports car features added");

	}

}
