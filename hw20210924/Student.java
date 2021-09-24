package com.work.hw20210924;

public class Student {
	private int rollno;
	private String firstName;
	private String lastName;
	private int standard;
	private float attendance;
	
	public Student() {
		this.rollno = 1;
		this.firstName="Nathan";
		this.lastName="Drake";
		this.standard=10;
		this.attendance=95.5f;
	}
	public Student(int rollno,String firstName,String lastName,int standard,float attendance) {
		this.rollno = rollno;
		this.firstName=firstName;
		this.lastName=lastName;
		this.standard=standard;
		this.attendance=attendance;
		
	}
	
	public void show() {
		System.out.println("Rollno: " + this.rollno);
		System.out.println("FirstName: " + this.firstName);
		System.out.println("Lastname: " + this.lastName);
		System.out.println("Standard: "+ this.standard);
		System.out.println("Attendance: "+ this.attendance);
	}
	

}
