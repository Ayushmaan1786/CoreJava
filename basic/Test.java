package com.java.basic;

public class Test {

	public static void main(String[] args) {

		String name = "Vijay"; // literal
		String name2 = new String("Vijay"); // new keyword= heap

		StringBuffer name3 = new StringBuffer("Vijay"); // new keyword= heap

		System.out.println(name.length());
		System.out.println(name2.length());
		System.out.println(name3.length());

		System.out.println(name3.capacity());

		System.out.println(name.charAt(1));
		System.out.println(name2.charAt(1));
		System.out.println(name3.charAt(1));

		System.out.println(name3.reverse());

	}

}
