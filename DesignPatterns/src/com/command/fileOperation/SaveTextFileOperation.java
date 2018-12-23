/**
 * 
 */
package com.command.fileOperation;

/**
 * @author ADMIN
 *
 */
public class SaveTextFileOperation implements TextFileOperation {

	TextFile textFile;

	public SaveTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.command.fileOperation.TextFileOperation#execute()
	 */
	@Override
	public String execute() {
		return textFile.save();
	}

}
