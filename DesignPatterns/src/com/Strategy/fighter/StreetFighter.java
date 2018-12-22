package com.Strategy.fighter;

public class StreetFighter {

	public static void main(String[] args) {

		Fighter ken = new Ken();
		ken.setJumpBehavior(new LongJump());
		ken.setKickBehavior(new LightningKick());
		ken.display();
		ken.jump();
		ken.kick();
		ken.punch();
		// change the behaviour at runtime
		ken.setJumpBehavior(new ShortJump());
		ken.jump();

	}

}
