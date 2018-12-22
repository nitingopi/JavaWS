package com.decorator.car;

public class CarStore {

	public static void main(String[] args) {
		Car car = new LuxuryCar(new SportsCar(new BasicCar()));
		car.assemble();

	}

}
