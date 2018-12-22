package com.Strategy.fighter;

public abstract class Fighter {
	KickBehaviour kickBehaviour;
	JumpBehaviour jumpBehaviour;

	/*
	 * public Fighter(KickBehaviour kickBehavior, JumpBehaviour jumpBehavior) {
	 * this.jumpBehaviour = jumpBehavior; this.kickBehaviour = kickBehavior; }
	 */

	public void punch() {
		System.out.println("Default Punch");
	}

	public void kick() {
		// delegate to kick behavior
		kickBehaviour.kick();
	}

	public void jump() {

		// delegate to jump behavior
		jumpBehaviour.jump();
	}

	public void roll() {
		System.out.println("Default Roll");
	}

	public void setKickBehavior(KickBehaviour kickBehavior) {
		this.kickBehaviour = kickBehavior;
	}

	public void setJumpBehavior(JumpBehaviour jumpBehavior) {
		this.jumpBehaviour = jumpBehavior;
	}

	public abstract void display();
}
