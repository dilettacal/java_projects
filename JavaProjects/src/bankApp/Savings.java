package bankApp;

public class Savings extends Account {
	// List properties specific to a saving account
	
	private int safetyDepositBoxID;
	private int safetyDepositBankKey; //access code

	public Savings(String name, String sSH, int initDeposit) {
		super(name, sSH, initDeposit);
		setAccountNumber("1" + this.getAccountNumber());
		setSafetyDeposityBox();
	}
	
	
	
	
	private void setSafetyDeposityBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBankKey = (int) (Math.random() * Math.pow(10, 4));
	}


	public int getSafetyDepositBoxID() {
		return safetyDepositBoxID;
	}


	public int getSafetyDepositBankKey() {
		return safetyDepositBankKey;
	}

	


	public void showInfo() {
		System.out.println("====== Savings Account =====");
		super.showInfo();
		System.out.println(
				"Your Savings Account Features:" + "\n"
				+ "Safety Deposit Box ID: " + safetyDepositBoxID + "\n"
				+ "Safety Deposit Box Key: " + safetyDepositBankKey+ "\n"+
				"Rate: " + rate + "%"
				);
		System.out.println("====== =============== =====");
		
	}


	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
}
