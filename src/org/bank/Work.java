package org.bank;

import java.util.ArrayList;
import java.util.List;

public class Work {
	int c = 100; // this .c instance

	public void sample() {
		int c = 1000; // local variable
		int a = 10;
		int b = 10;
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		Work w = new Work();

		w.sample();
		List<Integer> li = new ArrayList<>();

		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);

		System.out.println(li);

		int size = li.size();
		System.out.println(size);

		Integer integer = li.get(4);
		System.out.println(integer);

		int indexOf = li.indexOf(1);

		System.out.println(indexOf);
		long lastIndexOf = li.lastIndexOf(4);
		System.out.println(lastIndexOf);

		boolean empty = li.isEmpty();
		System.out.println(empty);

		li.add(10000000);
		System.out.println(li);

	}

}
