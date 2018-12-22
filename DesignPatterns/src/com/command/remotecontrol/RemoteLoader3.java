package com.command.remotecontrol;

public class RemoteLoader3 {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		// create devices - receiver
		Light livingRoomLight = new Light("Living room");
		Light kitchenLight = new Light("Kitchen light");

		// create light command objects - command object
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		// load command into slots - set command through invoker
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();

		System.out.println(remoteControl);

	}

}
