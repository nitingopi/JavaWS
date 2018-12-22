package com.nitin.items.item18;

public class Item18_1 extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added second
	public void doThat() {
		System.out.println("main : Do that");
	}

}

class A {
	// added first
	public void dothis() {
		System.out.println("A : do this");
	}

	// added third
	// create compilation error because method with similar signature and different
	// return type is present
	// in the subclass
	/*
	 * public int doThat() { System.out.println("A : do that"); }
	 */
}
