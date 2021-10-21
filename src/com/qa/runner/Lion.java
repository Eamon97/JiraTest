package com.qa.runner;

public class Lion extends Mammal{
	
	String breed;
	boolean male;
	
	


	public Lion(String name, boolean carnivore, String region, int age, String breed, boolean male) {
		super(name, carnivore, region, age);
		this.breed = breed;
		this.male = male;
	}



	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public boolean isMale() {
		return male;
	}



	public void setMale(boolean male) {
		this.male = male;
	}
	
	
	public void makeNoise() {
		System.out.println("ROOOOARRRRRR!!!!!");
	}

}
