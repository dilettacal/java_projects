package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	
	
		
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		// Set the department
		this.department = setDepartment();
		
		// Password generation
		this.password = randomPassword(defaultPasswordLength);
		
		// Combine elements to build email
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
	
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
	
	public String getPassword() {
		return password;
	}
	
	// Generate a random password
	private String randomPassword(int length) { 
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			System.out.println(i);
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);		
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public int getDefaultPasswordLength() {
		return defaultPasswordLength;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getCompanySuffix() {
		return companySuffix;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + this.firstName + " " + this.lastName
				+ "\nCOMPANY EMAIL: " + this.email + "\nMAILBOX CAPACITY: " 
				+ this.mailBoxCapacity;
	}

}

