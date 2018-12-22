package com.Strategy.duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard Duck");
	}

}
