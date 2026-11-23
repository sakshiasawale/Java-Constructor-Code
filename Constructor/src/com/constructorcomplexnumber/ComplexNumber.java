package com.constructorcomplexnumber;

//Write a Java program to create a class Complex and initialize complex numbers using a parameterized constructor.

public class ComplexNumber {

	int complex;
	int real;

	ComplexNumber(int complex, int real) {
		this.complex = complex;
		this.real = real;
	}

	public void displayNumbers() {
		System.out.println("Complex Number is:" + complex);
		System.out.println("Real Number is:" + real);
	}

	public static void main(String[] args) {
		ComplexNumber c = new ComplexNumber(10,20);
		c.displayNumbers();
	}
	

}
