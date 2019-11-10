package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	
		
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created:" + this.getFirstName() + " " + this.getLastName());	
		this.department = setDepartment();
	
	}
	
	//Ask for the department
	public String getDepartment() {
		return department;
	}
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none.\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		
		int choice = in.nextInt();
		if (choice == 1) { return "sales";}
		else if(choice == 2) {return "dev";	}
		else if (choice == 3) { return "acct";}
		else {return "";}
	}

	
	// Generate a random password
	
	// Set the maiilbox capacity
	
	// Set alternate email
	
	// Change password
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

}
