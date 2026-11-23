package com.objectexecution;

public class Execution {

	
	Execution()
	{
		System.out.println("=====Default Constructor=====");
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		Execution e = new Execution();
		System.out.println("First Object Create");
		Execution e1 = new Execution();
		System.out.println("Second Object Create");
		Execution e2 = new Execution();
		System.out.println("Third Object Create");
	}
	
}
