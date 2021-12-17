package com.java.basic;

public class StringsMethod {

	public static void main(String[] args) {
		String name = "Ayushmaan Sahu";
		System.out.println("String Length - " + name.length());
		System.out.println("Char At 6Th Address -  " + name.charAt(5));
		System.out.println("String " + name.indexOf("Sahu"));
		System.out.println("String " + name.indexOf("S"));
		System.out.println("String " + name.lastIndexOf("u"));
		System.out.println("String " + name.replace("a", "b"));
		System.out.println("String " + name.replaceAll("a", "b"));
		System.out.println("String " + name.toLowerCase());
		System.out.println("String " + name.toUpperCase());
		System.out.println("String " + name.startsWith("Ayush"));
		System.out.println("String " + name.endsWith("Sahu"));
		System.out.println("String " + name.substring(6));
	}

}
