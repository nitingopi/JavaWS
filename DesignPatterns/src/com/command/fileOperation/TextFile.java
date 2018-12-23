package com.command.fileOperation;

public class TextFile {
	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	public String open() {
		return name + " : file is opened";
	}

	public String save() {
		return name + " : file is saved";
	}
}
