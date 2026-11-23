package com.constructoroverloading;


//Write a Java program to demonstrate constructor overloading.


public class Overloading {

	int i ;
	String name;
	
	Overloading()
	{
		System.out.println("---Default Constructor---");
	}
	Overloading(int i)
	{
		System.out.println("---One Parameter Constructor---");
	}
	Overloading(int i,String name)
	{
		System.out.println("---Two Parameter Constructor---");
	}
	Overloading(int i,double d,char c)
	{
		System.out.println("---Three Parameter Constructor---");
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		
		int i = 20;
		Overloading o1 = new Overloading(i);
		System.out.println(i);
		
		int j = 30;
		String name = "PQR";
		Overloading o2 = new Overloading(j,name);
		System.out.println(j);
		System.out.println(name);
		
		
		Overloading o3 = new Overloading(90,90.0,'A');
	}
}