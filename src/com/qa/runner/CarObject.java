package com.qa.runner;


public class CarObject {
	public String manufacturer; 
	public String model;
	public int bhp;
	public int topSpeed;
	public boolean automatic;
	
	public CarObject(String manufacturer, String model, int bhp, int topSpeed, boolean automatic) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.bhp = bhp;
		this.topSpeed = topSpeed;
		this.automatic = automatic;
	}
	public CarObject(String manufacturer, String model, int bhp, int topSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.bhp = bhp;
		this.topSpeed = topSpeed;
	
	}
	
	public CarObject(String manufacturer,int bhp, int topSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.model=null;
		this.bhp = bhp;
		this.topSpeed = topSpeed;
		this.automatic=false;

	}
	@Override
	public String toString() {
		return "CarObject [manufacturer=" + manufacturer + ", model=" + model + ", bhp=" + bhp + ", topSpeed="
				+ topSpeed + ", automatic=" + automatic + "]";
	}
	//Getters and Setters
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBhp() {
		return bhp;
	}
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	
	
	}




