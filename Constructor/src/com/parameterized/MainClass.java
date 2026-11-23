package com.parameterized;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student(10, "Sakshi","Takve BK", 1234567890l, 22, 'A');
		System.out.println("===========Student Deatils=========");
		
		System.out.println("Student Roll No:"+s.roll_no);
		System.out.println("Student Name:"+s.name);
		System.out.println("Student Address:"+s.address);
		System.out.println("Student Contact Number:"+s.contact);
		System.out.println("Student Age:"+s.age);
		System.out.println("Student Grade:"+s.grade);
		
		System.out.println("======================================");
		System.out.println("======================================");
		System.out.println("======================================");
		
		
		System.out.println("===========Employee Deatils=========");
		Employee e = new Employee(211, "Sakshi", 90000.0);
		System.out.println("Employee ID:"+e.eid);
		System.out.println("Employee Name:"+e.ename);
		System.out.println("Employee Salary:"+e.salary);
	}
}
