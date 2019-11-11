package studiDBApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private int tuitionBalance = 0;
	private String studentID;
	
	//static variables 
	private static int dbID = 1000; //increment by one for each student created
	private static int costOfCourse = 600;
	
	
	// Constructor prompt user to enter name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Please enter your last name:");
		this.lastName = in.nextLine();
		
		System.out.println("Please enter your graduation year:\n1 - Freshman;\n2 - Sophmore;\n3 - Junior;\n4 - Senior");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		dbID += 1;
		
		this.studentID = setStudentID();
		
		System.out.println(this.studentID);
		
	}
	
	
	// Generate a ID (5 digits, unique)
	
	private String setStudentID() {
		//Grade Level + ID
		return gradeYear + "" + dbID;
	}
	
	
	
	// Enroll in courses
	
	public void enroll() {
		//loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();		
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
			
		} while (1 != 0);
		
	}
	
	// View balance
	
	public void viewBalance() {
		System.out.println("Your balance is € " + tuitionBalance);
	}
	
	// Pay the tuition
	public void payTuitionBalance() {
		viewBalance();
		System.out.println("Enter your payment:");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of EUR " + payment);
		viewBalance();
	}
	
	// Show status
	
	public String toString() {
		
		return "Name: " + firstName + " " + lastName + "\nCourses enrolled: " + courses 
				+ "\nBalance is: " + tuitionBalance;
		
	}

}
