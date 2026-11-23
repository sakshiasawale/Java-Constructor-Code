package com.constructor;

public class DefaultConstructor {

	int roll_no;
	String name;
	int age;
	String address;
	long contact;
	double fees;
	
	DefaultConstructor()
	{
		roll_no = 10;
		name = "Sakshi";
		age = 22;
		address = "Takave Bk";
		contact = 1234567890;
		fees = 90000.0;
	}
	
	public void displayStudentDetails()
	{
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println("Student Roll numbers is :"+dc.roll_no);
		System.out.println("Student Name is :"+dc.name);
		System.out.println("Student Age is :"+dc.age);
		System.out.println("Student Address :"+dc.address);
		System.out.println("Student Contact Number:"+dc.contact);
		System.out.println("Student Fees:"+dc.fees);
	}
	
	public static void main(String[] args) {
		DefaultConstructor dc1 = new DefaultConstructor();
		dc1.displayStudentDetails();
	}
}
