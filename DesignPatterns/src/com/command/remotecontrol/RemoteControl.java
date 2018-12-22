package com.command.remotecontrol;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
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
