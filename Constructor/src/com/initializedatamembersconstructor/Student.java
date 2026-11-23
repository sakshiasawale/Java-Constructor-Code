package com.initializedatamembersconstructor;

//Write a Java program to initialize object data members using a constructor.


public class Student {

	int roll_NO ;
	String name ;
	double fees;
	
	Student(int roll_NO,String name, double fees)
	{
		this.roll_NO = roll_NO;
		this.name = name;
		this.fees = fees;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Roll no:"+roll_NO);
		System.out.println("Name is:"+name);
		System.out.println("Fee is :"+fees);
	}
	
	public static void main(String[] args) {
		Student s = new Student(29, "Abc", 750000);
		s.displayStudentDetails();
	}
}
