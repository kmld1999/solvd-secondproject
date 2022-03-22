package com.solvd.laba.RealStateAgency;

public class Customer extends Person implements IRent, IBuy {
	private int salary;
	private int moneyAvailable;
	
	//constructor
	public Customer(int pID, String pName, String pTelephone) {
		super(pID, pName, pTelephone);
	}
	
	//setters
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//getters
	public int getSalary() {
		return salary;
	}

	@Override
	public void buy() {
		System.out.println("I want to buy a property.");
	}

	@Override
	public void rent() {
		System.out.println("I want to rent a property.");
	}
}
