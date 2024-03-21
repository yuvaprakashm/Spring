package com.yuva;

public class PrintableFactory {
	public static Printable getPrintable() {
		return new B();
		//return new A();
	}
}
