package bankApp;

public class Checking extends Account {

	// List properties specific to a Checking account - Debit Card, PIN
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSH, int initDeposit) {
		super(name, sSH, initDeposit);
		setAccountNumber("2" + this.getAccountNumber());
		setDebitCard();
	}
	
	// List any methods specific to checking accounts
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("====== Checking Account =====");
		super.showInfo();
		System.out.println(
				"Your Checking Account Features:" + "\n"
				+ "Debit Card Number: " + debitCardNumber + "\n"
				+ "Debit Card PIN: " + debitCardPIN
				);
		System.out.println("====== =============== =====");
	}
}
