package com.command.remotecontrol;

public class LightOnCommandL implements CommandL {

	Light light;

	public LightOnCommandL(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
