/**
 * 
 */
package com.command.fileOperation;

/**
 * @author ADMIN
 *
 */
public class OpenTextFileOperation implements TextFileOperation {

	TextFile textFile;

	public OpenTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.command.fileOperation.TextFileOperation#execute()
	 */
	@Override
	public String execute() {
		return textFile.open();
	}

}
