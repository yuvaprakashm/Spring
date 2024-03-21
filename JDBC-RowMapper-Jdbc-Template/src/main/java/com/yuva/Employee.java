package com.yuva;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private int rowNum;

	public Employee(int id, String name, float salary, int rowNum) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.rowNum = rowNum;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void  getRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	static {
		System.out.println("ROW ID  NAME  SALARY");
	}
	public String toString() {
		return  rowNum+ "  " + id + "  " + name + "  " + salary;
	}
}
