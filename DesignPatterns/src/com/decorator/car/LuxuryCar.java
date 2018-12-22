package com.decorator.car;

public class LuxuryCar extends CarDecorator {
	Car car;

	public LuxuryCar(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("....Now Luxury car features added");

	}

}
