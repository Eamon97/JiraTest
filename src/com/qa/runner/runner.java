package com.qa.runner;

public class runner {
	public static void main(String[]args) {
		
	CarObject Ferrari=new CarObject("Ferrari","458 spider" , 455, 267, true);
	CarObject Mercedes=new CarObject("Mercedes","a200",168,140,true);
	
	Manager newManager = new Manager();
	
	newManager.addAnimals();
	//System.out.println(Ferrari.topSpeed);
	//System.out.println(Mercedes.topSpeed);
	}
	

}
