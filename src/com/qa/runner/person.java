package com.qa.runner;

public class person implements animal,human{

	
	public void makenoise() {
		System.out.println("Hello, how are you");
	}
	
	public void run() {
		System.out.println("Starting to run");
		
	}

	@Override
	public void interact() {
		System.out.println("Doing something...");
		
	}
	
}
