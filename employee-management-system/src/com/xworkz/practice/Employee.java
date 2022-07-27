package com.xworkz.practice;

public class Employee {
    
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public static void main(String[] args) {
		Address address1=new Address("Gulbarga","Karnataka","India");
		Address address2=new Address("Chikmangaluru","Karnataka","India");
		
		Employee a1=new Employee(1,"vandu",address1);
		Employee a2=new Employee(2,"Vatsala",address2);
		
		a1.display();
		a2.display();
	}
	
	void display() {
		System.out.println(id + " "+ name);
		System.out.println(address.city + " " + address.state + " " + address.address);
	}
}
