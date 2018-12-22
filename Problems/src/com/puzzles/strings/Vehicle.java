package com.puzzles.strings;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Vehicle {
	private int number;
	private String name;
	private double price;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {

		Vehicle v;
		Scanner sc = new Scanner(System.in);
		String input;
		int n = sc.nextInt();
		Vehicle[] vehicles = new Vehicle[n];
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			String name = sc.next();
			double price = sc.nextDouble();
			v = new Vehicle(number, name, price);
			vehicles[i] = v;
		}

		Object[] vehicless = Solution.getOddPositionVehicle(vehicles);
		for (int j = 0; j < vehicless.length; j++) {
			Vehicle vv = (Vehicle) vehicless[j];
			System.out.println(vv.getNumber() + " " + vv.getName() + " " + vv.getPrice());
		}
	}
}

class Solution {
	public static Object[] getOddPositionVehicle(Vehicle[] vehicles) {
		int n = vehicles.length;

		Stream<Vehicle> s = Arrays.stream(vehicles).filter(v -> v.getNumber() % 2 == 0)
				.sorted(comparing(Vehicle::getPrice));

		return s.toArray();

	}
}
