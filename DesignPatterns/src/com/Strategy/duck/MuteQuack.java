package com.Strategy.duck;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");

	}

}
