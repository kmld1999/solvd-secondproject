package com.solvd.laba.RealStateAgency;

public class Apartment extends Building {
	private boolean uniqueRoom;
	private int rentPriceA;

	public Apartment(int hID, String adress, int superface) {
		super(hID, adress, superface);
	}
	
	//setters
	public void setRentPriceA(int rentPriceA) {
		setSuperface(superface);
		this.rentPriceA = getSuperface() * getZone();
	}
	public void setUniqueRoom(boolean uniqueRoom) {
		this.uniqueRoom = uniqueRoom;
	}
	
	//getters
	public int getRentPriceA() {
		return rentPriceA;
	}
	public boolean getUniqueRoom() {
		return uniqueRoom;
	}
}
