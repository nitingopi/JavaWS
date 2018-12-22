package com.Strategy.duck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		// default behaviour
		mallard.performFly();
		mallard.performQuack();

		// behaviour changed at run time
		mallard.setFlyBehaviour(new FlyWithWings());
		mallard.setQuackBehaviour(new MuteQuack());
		mallard.performFly();
		mallard.performQuack();

	}

}
