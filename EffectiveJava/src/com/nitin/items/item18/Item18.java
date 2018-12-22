package com.nitin.items.item18;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Item18 {
	public static void main(String[] args) {
		// System.out.println("Hello world");
		InstrumentedHashSet<String> s = new InstrumentedHashSet();
		s.addAll(Arrays.asList("amar", "akbar", "anthony"));
		System.out.println(s.getCount() + " " + s.toString());

	}
}

class InstrumentedHashSet<E> extends HashSet<E> {
	private int addCount = 0;

	public InstrumentedHashSet() {

	}

	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getCount() {
		return addCount;
	}
}