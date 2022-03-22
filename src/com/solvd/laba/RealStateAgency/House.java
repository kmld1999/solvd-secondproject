package com.solvd.laba.RealStateAgency;

public class House extends Building {
	private boolean hasHouseYard;
	private int houseYard;
	private int zone2;
	int rentPriceH;

	public House(int hID, String adress, int superface) {
		super(hID, adress, superface);
	}
	

	//setters
	public void setZone2(int zone2) {
		this.zone2 = zone2;
	}
	public void setRentPriceH(int rentPriceH) {
		setSuperface(superface);
		this.rentPriceH = getSuperface() * getZone() + houseYard * zone2;
	}
	public void setHasHouseYard(boolean hasHouseYard) {
		this.hasHouseYard = hasHouseYard;
	}
	
	//getters
	public int getRentPriceH() {
		return rentPriceH;
	}
	public boolean getHasHouseYard() {
		return hasHouseYard;
	}
}
