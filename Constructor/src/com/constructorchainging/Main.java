package com.constructorchainging;

//Write a Java program to demonstrate constructor chaining using this().

public class Main extends ConstructorChainging {

	Main()
	{
		this(30,"Pqr");
		System.out.println("--Default Constructor for Main class--");
	}
	
	Main(int i)
	{
		super(30);
		System.out.println("--One Parameter Constructor for Main Class--");
	}
	
	Main(int i , String name)
	{
		this(29,9000.0,20.0f);
		System.out.println("--Two Parameter Constructor for Main Class--");
	}
	Main(int i , double d,float f)
	{
		this(13);
		System.out.println("--Three Parameter Constructor for Main Class--");
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}
}
