package com.nitin.items;

import java.util.ArrayList;
import java.util.List;

public class Item51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Apples");
		ls.add("Oranges");
		ls.add("Mangoes");
		ls.add("Cheeko");
		ls.add("Mangoes");
		ls.add("Guava");
		System.out.println(ls);
		System.out.println(ls.subList(1, 5));
		System.out.println(ls.subList(1, 5).indexOf("Mangoes"));
		System.out.println(ls.subList(1, 5).lastIndexOf("Mangoes"));
		String s = "apple";
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		System.out.println(s + " " + str);

	}

}
