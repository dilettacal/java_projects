package bankApp;

public class Checking extends Account {

	// List properties specific to a Checking account - Debit Card, PIN
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSH, int initDeposit) {
		super(name, sSH, initDeposit);
		this.setAccountNumber("2" + this.getAccountNumber());
	}
	
	// List any methods specific to checking accounts
}
