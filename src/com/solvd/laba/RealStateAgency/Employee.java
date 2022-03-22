package com.solvd.laba.RealStateAgency;

public class Employee extends Person implements IWork, IHelp{
	private String position;
	private int emplID;

	public Employee(int pID, String pName, String pTelephone) {
		super(pID, pName, pTelephone);
	}

	@Override
	public void work() {
		System.out.println("I'm working here.");
	}

	@Override
	public void help() {
		System.out.println("Hello, how can I help you?");
	}

}
