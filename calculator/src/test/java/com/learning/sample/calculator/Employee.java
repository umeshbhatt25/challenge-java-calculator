package com.learning.sample.calculator;

public class Employee {
	private boolean isContract = false; 
	private int id = 0;
	private String name;
	private String department;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(boolean isContract, int id, String name, String department, String address) {
		this.isContract = isContract;
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
	}
	
	public boolean isContract() {
		return isContract;
	}
	
	public void setContract(boolean isContract) {
		this.isContract = isContract;
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
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
