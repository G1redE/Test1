package com.work.hw20210924;

public class Studentcall {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.show();
		System.out.println("\n");
		//for parameterized constructors give parameters as follows (int rollno,String Firstname,String Lastname,int Standard,float Attendance)
		Student obj1 = new Student(1,"Jeevan","Reddy",10,99.9f);
		obj1.show();
	}

}
