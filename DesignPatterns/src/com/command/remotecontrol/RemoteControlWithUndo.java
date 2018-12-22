package com.command.remotecontrol;

public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		System.out.println("\n--------Pushing button on--------");
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButonWasPushed(int slot) {
		System.out.println("\n--------Pushing button off--------");
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		System.out.println("\n--------Undo button--------");
		undoCommand.undo();
	}

	@Override
	public String toString() {
		StringBuffer stringbuff = new StringBuffer();
		stringbuff.append("\n------Remote control---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringbuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  "
					+ offCommands[i].getClass().getName() + "\n");
		}
		stringbuff.append("Undo " + undoCommand.getClass().getName());
		return stringbuff.toString();
	}
}
