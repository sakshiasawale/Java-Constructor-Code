package com.constructorchainging;

//Write a Java program to demonstrate constructor chaining using this().

public class ConstructorChainging {

	ConstructorChainging()
	{
		this(90,"abc");
		System.out.println("--Default Constructor for ConstructorChainging--");
	}
	
	ConstructorChainging(int i)
	{
		this();
		System.out.println("--One Parameter Constructor for ConstructorChainging--");
	}
	
	ConstructorChainging(int j,String name)
	{
		this(80,800.0,'A');
		System.out.println("--Two Parameter Constructor for ConstructorChainging--");
	}
	ConstructorChainging(int k,double d,char c)
	{
		System.out.println("--Three Parameter Constructor for ConstructorChainging--");
	}
}
