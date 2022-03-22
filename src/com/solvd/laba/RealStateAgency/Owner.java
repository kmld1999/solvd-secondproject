package com.solvd.laba.RealStateAgency;

public class Owner extends Person implements IBuy, ICollectRent {
	
	
	//constructor
	public Owner(int pID, String pName, String pTelephone) {
		super(pID, pName, pTelephone);
	}

	@Override
	public void collectRent() {
		System.out.println("Rent collected.");
	}

	@Override
	public void buy() {
		System.out.println("Propiety bought.");
	}
	
}
