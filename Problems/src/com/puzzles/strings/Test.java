package com.puzzles.strings;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Please enter the input values");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArr = input.split(" ");
		int x1 = Integer.valueOf(inputArr[0]);
		int y1 = Integer.valueOf(inputArr[1]);
		int x2 = Integer.valueOf(inputArr[2]);
		int y2 = Integer.valueOf(inputArr[3]);
		int z1 = Math.abs(x1 - x2);
		int z2 = Math.abs(y1 - y2);
		double distance = Math.sqrt(z1 * z1 + z2 * z2);
		DecimalFormat df = new DecimalFormat("#.000");
		// df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(df.format(distance));
	}

}
