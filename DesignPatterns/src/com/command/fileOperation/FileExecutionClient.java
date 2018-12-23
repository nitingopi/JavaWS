package com.command.fileOperation;

public class FileExecutionClient {

	public static void main(String[] args) {
		TextFile textFile;
		OpenTextFileOperation openFile;
		SaveTextFileOperation saveFile;
		TextFileOperationExecutor fileOperator;
		textFile = new TextFile("Java");

		openFile = new OpenTextFileOperation(textFile);
		saveFile = new SaveTextFileOperation(textFile);
		fileOperator = new TextFileOperationExecutor();

		// open file
		System.out.println(fileOperator.performFileOperation(openFile));
		// save file
		System.out.println(fileOperator.performFileOperation(saveFile));

		/** using lambda **/
		// open file
		// here command implementation class : OpenTextFileOperation.java is not needed
		System.out.println(fileOperator.performFileOperation(() -> "Opening file : Java"));
		// save file
		// here command implementation class : SaveTextFileOperation.java is not needed
		System.out.println(fileOperator.performFileOperation(() -> "Saving file : Java"));

		/** using Method reference **/
		// open file
		// here command implementation class : OpenTextFileOperation.java is not needed
		System.out.println(fileOperator.performFileOperation(textFile::open));
		// save file
		// here command implementation class : SaveTextFileOperation.java is not needed
		System.out.println(fileOperator.performFileOperation(textFile::save));

	}

}
