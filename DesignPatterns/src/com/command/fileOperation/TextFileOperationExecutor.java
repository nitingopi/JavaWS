package com.command.fileOperation;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
	TextFile textFile;
	List<TextFileOperation> fileOperations = new ArrayList<>();

	/*
	 * public void setFileOperation(TextFileOperation fileOperation) {
	 * fileOperations.add(fileOperation); }
	 */
	public String performFileOperation(TextFileOperation fileOperation) {
		fileOperations.add(fileOperation);

		return fileOperation.execute();
	}

}
