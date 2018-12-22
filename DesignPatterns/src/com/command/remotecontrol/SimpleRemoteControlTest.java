package com.command.remotecontrol;

//this is our client
public class SimpleRemoteControlTest {

	public static void main(String[] args) {

		// remote is our invoker
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();

		// light will be the receiver of the request
		Light light = new Light("");

		// create a command and pass the receiver
		LightOnCommand lightOnCommand = new LightOnCommand(light);

		// pass command to the invoker
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
	}

}
