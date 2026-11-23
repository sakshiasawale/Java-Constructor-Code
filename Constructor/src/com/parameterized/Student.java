package com.parameterized;

public class Student {

	int roll_no;
	String name;
	String address;
	long contact;
	int age;
	char grade;
	
	Student(int studroll_no,String studname,String studaddress,long studcontact,int studage,char studgrade)
	{
		roll_no = studroll_no;
		name = studname;
		address = studaddress;
		contact = studcontact;
		age = studage;
		grade = studgrade;
	}
	
}
