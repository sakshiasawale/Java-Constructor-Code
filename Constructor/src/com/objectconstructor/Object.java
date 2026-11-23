package com.objectconstructor;

public class Object {

	int age;
	String name;
	float marks;
	
	Object(int stdAge,String stdName,float stdMarks)
	{
		age =stdAge;
		name = stdName;
		marks = stdMarks;
	}
	
	public static void main(String[] args) {
		Object o = new Object(22,"Sakshi",95.9f);
		System.out.println("Student Age:"+o.age);
		System.out.println("Student Name:"+o.name);
		System.out.println("Student Marks:"+o.marks);
	}
}
