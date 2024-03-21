package com.yuva;

public class A {
	private static final A obj = new A();
	private A() {
		System.out.println("private constructor");
	}
	public static A getA() {
		System.out.println("Factory Method");
		return obj;
	}
	public void msg() {
		System.out.println("Hello User");
	}
}
