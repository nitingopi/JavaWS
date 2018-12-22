package com.command.remotecontrol;

public class RemoteControlL {
	CommandL[] onCommands;
	CommandL[] offCommands;

	public RemoteControlL() {
		onCommands = new CommandL[7];
		offCommands = new CommandL[7];

		// NoCommandL noCommand = new NoCommandL();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = () -> {
			};
			offCommands[i] = () -> {
			};
		}
	}

	public void setCommand(int slot, CommandL onCommand, CommandL offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	@Override
	public String toString() {
		StringBuffer stringbuff = new StringBuffer();
		stringbuff.append("\n------Remote control---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringbuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringbuff.toString();
	}
}
