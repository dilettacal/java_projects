package bankApp;

public class Savings extends Account {
	// List properties specific to a saving account
	
	private int safetyDepositBoxID;
	private int safetyDepositBankKey;

	public Savings(String name, String sSH, int initDeposit) {
		super(name, sSH, initDeposit);
		this.setAccountNumber("1" + this.getAccountNumber());
	}
	
	
	// Constructor to initialize saving account properties
		
	// List any methods specific to saving accounts

}
