package com.multipleconstructor;

public class Student {

	Student()
	{
		System.out.println("====Default Constructor====");
	}
	
	Student(int i)
	{
		System.out.println("====One Argument Constructor====");
		System.out.println(i);
	}
	
	Student(String name,float marks)
	{
		System.out.println("====Two Argument Constructor====");
		System.out.println(name+" "+marks);
	}
	
	Student(char c,boolean flag,double fees )
	{
		System.out.println("====Three Argument Constructor====");
		System.out.println(c+" "+flag+" "+fees);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(10);
		Student s2 = new Student("Sakshi",98.0f);
		Student s3 = new Student('S',true,96000.0);
	}
}
