package com.tnsif.day8.Interfaces.ExtendingInterfaces;



public class ExtendingInterfaceDemo implements ChildInterfaces{
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}