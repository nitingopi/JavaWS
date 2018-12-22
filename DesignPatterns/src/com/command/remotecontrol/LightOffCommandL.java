package com.command.remotecontrol;

public class LightOffCommandL implements CommandL {

	Light light;

	public LightOffCommandL(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
