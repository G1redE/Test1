package com.work.hw20210922;

public class Createstudent {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setRollno(1);
		std1.setFirstName("Trent");
		std1.setLastName("Boult");
		std1.setStandard(10);
		std1.setAttendance(75.0f);
		
		System.out.println("First Name: " + std1.getFirstName());
		System.out.println("Last Name: " + std1.getLastName());
		System.out.println("Standard: " + std1.getStandard());
		System.out.println("Attendance: " + std1.getAttendance()+"%");
		
		System.out.println('\n');
		
		Student std2 = new Student();
		
		std2.setRollno(2);
		std2.setFirstName("Tim");
		std2.setLastName("Southee");
		std2.setStandard(10);
		std2.setAttendance(80.0f);
		
		System.out.println("First Name: " + std2.getFirstName());
		System.out.println("Last Name: " + std2.getLastName());
		System.out.println("Standard: " + std2.getStandard());
		System.out.println("Attendance: " + std2.getAttendance()+"%");
		
		System.out.println('\n');
		
		Student std3 = new Student();
		std3.setRollno(3);
		std3.setFirstName("Ross");
		std3.setLastName("Taylor");
		std3.setStandard(10);
		std3.setAttendance(70.0f);
		
		System.out.println("First Name: " + std3.getFirstName());
		System.out.println("Last Name: " + std3.getLastName());
		System.out.println("Standard: " + std3.getStandard());
		System.out.println("Attendance: " + std3.getAttendance()+"%");
		
		System.out.println('\n');

		Student std4 = new Student();
		std4.setRollno(4);
		std4.setFirstName("Kane");
		std4.setLastName("Williamson");
		std4.setStandard(10);
		std4.setAttendance(79.0f);
		
		System.out.println("First Name: " + std4.getFirstName());
		System.out.println("Last Name: " + std4.getLastName());
		System.out.println("Standard: " + std4.getStandard());
		System.out.println("Attendance: " + std4.getAttendance()+"%");
		
		System.out.println('\n');
		
		Student std5 = new Student();
		std5.setRollno(5);
		std5.setFirstName("Martin");
		std5.setLastName("Guptill");
		std5.setStandard(10);
		std5.setAttendance(99.0f);
		
		System.out.println("First Name: " + std5.getFirstName());
		System.out.println("Last Name: " + std5.getLastName());
		System.out.println("Standard: " + std5.getStandard());
		System.out.println("Attendance: " + std5.getAttendance()+"%");
		
		System.out.println('\n');
	}

}
