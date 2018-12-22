package com.command.remotecontrol;

public class RemoteLoaderL {

	public static void main(String[] args) {
		RemoteControlL remoteControl = new RemoteControlL();

		// create the receiver
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");

		// create the commands ON
		// LightOnCommandL lightOn = new LightOnCommandL(light);

		// create the commands OFF
		// LightOffCommandL lightOff = new LightOffCommandL(light);

		// remoteControl.setCommand(0, () -> light.on(), () -> light.off());
		// both are same
		remoteControl.setCommand(0, light::on, light::off);

		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.offButonWasPushed(0);
		System.out.println(remoteControl);

	}

}
