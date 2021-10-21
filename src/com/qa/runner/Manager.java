package com.qa.runner;

import java.util.ArrayList;

public class Manager {

	ArrayList<Mammal> animalList = new ArrayList<>();
	
	Mammal eamon=new Mammal("Eamon",true,"London",23);
	Mammal dog=new Mammal("dog",true,"London",42);
	
	public void addAnimals() {
	animalList.add(eamon);
	System.out.println(animalList);
	animalList.add(dog);
	System.out.println(animalList);
	
}
}

