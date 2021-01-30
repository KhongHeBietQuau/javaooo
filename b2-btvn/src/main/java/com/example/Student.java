package com.example;

public class Student {
	private String ID;
	private String Name;
	private String Email;
	private String Address;
	
	public Student() {
		super();
	}
	public Student(String iD, String name, String email, String address) {
		super();
		ID = iD;
		Name = name;
		Email = email;
		Address = address;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
