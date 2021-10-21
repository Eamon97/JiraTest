package com.qa.runner;

public class Mammal {

	public String name;
	public boolean carnivore;
	public String region;
	public int age;
	



	public Mammal(String name, boolean carnivore, String region, int age) {
		this.name = name;
		this.carnivore = carnivore;
		this.region = region;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarnivore() {
		return carnivore;
	}

	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void makeNoise() {
		
	}
	
	public void newAnimal() {
		System.out.println("Your animal is 0 days old");
		this.age=0;
	}

	@Override
	public String toString() {
		return "Mammal [name=" + name + ", carnivore=" + carnivore + ", region=" + region + ", age=" + age + "]";
	}
	
	
}
