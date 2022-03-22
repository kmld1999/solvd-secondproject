package com.solvd.laba.RealStateAgency;

public class Building {
	private int hID;
	private String adress;
	protected int superface;
	private int zone;
	
	//constructor
	public Building(int hID, String adress, int superface) {
		this.hID = hID;
		this.adress = adress;
		this.superface = superface;
	}
	
	//setters
	public void setHID(int hID) {
		this.hID = hID;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setSuperface(int superface) {
		this.superface = superface;
	}
	public void setZone(int zone) {
		this.zone = zone;
	}

	//getters
	public int getSuperface() {
		return superface;
	}
	public int getZone() {
		return zone;
	}
	public String getAdress() {
		return adress;
	}
	
	
}

