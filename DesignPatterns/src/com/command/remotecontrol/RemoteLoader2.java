package com.command.remotecontrol;

public class RemoteLoader2 {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		// create devices - receiver
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		// create light command objects - command object
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		// load command into slots - set command through invoker
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);// turn the fan on medium
		remoteControl.offButonWasPushed(0);// turn it off

		System.out.println(remoteControl);

		remoteControl.undoButtonWasPushed();// turn back to medium

		remoteControl.onButtonWasPushed(1);// turn the fan to high
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();// turn it back to medium

	}

}
