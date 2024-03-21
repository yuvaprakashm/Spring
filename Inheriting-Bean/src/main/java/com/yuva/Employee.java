package com.yuva;

public class Employee {
	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void show() {
		System.out.println("ID : " + id + " NAME : " + name);

		System.out.println(address);
	}
}
