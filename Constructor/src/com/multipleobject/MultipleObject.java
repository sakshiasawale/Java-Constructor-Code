package com.multipleobject;

//Write a Java program to demonstrate the execution order of constructors when multiple objects are created.?

public class MultipleObject {
	
	MultipleObject()
	{
		System.out.println("----Default Constrctor---");
	}
	
	public static void main(String[] args) {
		
		System.out.println("---First Object Creation----");
		MultipleObject m = new MultipleObject();
		
		System.out.println("---Second Object Creation----");
		MultipleObject m1 = new MultipleObject();
		
		System.out.println("---Third Object Creation----");
		MultipleObject m2 = new MultipleObject();
		
		System.out.println("---Four Object Creation----");
		MultipleObject m3 = new MultipleObject();
	}
}
