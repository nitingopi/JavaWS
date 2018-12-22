package com.command.remotecontrol;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	private String location;
	private int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
		System.out.println(location + " ceiling fan constructor created: OFF");
	}

	public void high() {
		speed = HIGH;
		System.out.println(location + " ceiling fan is on HIGH");
	}

	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on MEDIUM");
	}

	public void low() {
		speed = LOW;
		System.out.println(location + " ceiling fan is on LOW");
	}

	public void off() {
		speed = OFF;
		System.out.println(location + " ceiling fan is switched off");
	}

	public int getSpeed() {
		return speed;
	}

}
