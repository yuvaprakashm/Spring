package com.yuva;

public class PrintableFactory {
//non-static factory method  
	public Printable getPrintable() {
		return new A();// return any one instance, either A or B
		// return new B();
	}
}