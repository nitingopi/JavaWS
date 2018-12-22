package com.Strategy.duck;

public class FlyNoWay implements FlyBehaviour {
	@Override
	public void fly() {
		System.out.println("I can not fly");
	}
}
