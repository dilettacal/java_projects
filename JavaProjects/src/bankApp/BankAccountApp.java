package bankApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		/*
		
		Account ckacc1 = new Checking("Tim Wellington", "444102638",1000);
		ckacc1.showInfo();
		ckacc1.deposit(1000);
		ckacc1.withdraw(500);
		ckacc1.transfer("Brokerage", 150);
		ckacc1.compound();
		
		System.out.println();
		Account savAcc1 = new Savings("Robert Wellington", "104051051",500);
		savAcc1.showInfo();
		
		*/
		
		List<Account> accounts = new LinkedList<Account>();
		
		System.out.println("Read from CSV...");
		String file = "E:\\Programming\\Java\\java_projects\\JavaProjects\\src\\bankApp\\bankDB.csv";
		// Read csv file and create accounts based on that data
		List<String[]> newCustomers = utilities.CSV.readStringFile(file);
		
		for(String[] accountHolder: newCustomers) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")) {
				Account savAcc = new Savings(name, ssn, (int) initDeposit);
				accounts.add(savAcc);		
			} else {
				Account checkAcc = new Checking(name, ssn, (int) initDeposit);
				accounts.add(checkAcc);	
			}			
		}
		
		for(Account acc: accounts) {
			acc.showInfo();
		}

	}

}
