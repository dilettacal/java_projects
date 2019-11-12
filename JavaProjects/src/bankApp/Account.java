package bankApp;

public abstract class Account implements IRate {
	

	// List common properties for savings and checking accounts
	
	private String name;
	private String ssn;
	private double balance;
	protected String accountNumber;
	protected double rate;
	
	static int index = 10000;
		
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, int initDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initDeposit;
		index++;
		this.accountNumber = setAccountNumber();
		setRate(); // call the respective rate
	}
	
	public abstract void setRate();
	
	
	// List common methods: deposit, withdraw, transfer
	
	public void deposit(double amount){
		balance = balance + amount;		
		System.out.println("Depositing EUR " + amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.println("Withdrawing EUR " + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance = balance - amount;
		System.out.println("Transfering EUR " + amount + " to " + toWhere);		
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now EUR " + getBalance());
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void compound() {
		//balance * rate
		double accruedInterest = balance * (rate / 100);
		balance = balance + accruedInterest;
		printBalance();	
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	private String setAccountNumber() {
		 String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
		 int uniqueID = index;
		 int randonNumber = (int) (Math.random() * Math.pow(10,3));
		 return lastTwoOfSSN + uniqueID + randonNumber;
	}
	
	public void showInfo() {
		System.out.println(
				"Name: " + name + "\n"
				+ "Account number: " + accountNumber + "\n"
				+ "Balance: " + balance	
				);
	}

}
