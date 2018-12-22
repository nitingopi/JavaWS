package com.puzzles.strings;

public class UniqueCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "suryanarayana";
		char[] namearr = name.toCharArray();
		int[] arr = new int[26];
		for (char c : namearr) {
			arr[c - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 1) {
				System.out.println(Character.toString((char) (i + 97)));
			}
		}

	}

}
