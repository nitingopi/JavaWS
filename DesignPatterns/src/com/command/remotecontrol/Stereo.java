package com.command.remotecontrol;

public class Stereo {
	public void on() {
		System.out.println("Stereo : ON");
	}

	public void off() {
		System.out.println("Stereo : OFF");
	}

	public void setCD() {
		System.out.println("Stereo : set CD");
	}

	public void setDVD() {
		System.out.println("Stereo : set DVD");
	}

	public void setRadio() {
		System.out.println("Stereo : set Radio");
	}

	public void setVolume(int volume) {
		System.out.println("Stereo : set volume " + volume);
	}
}
