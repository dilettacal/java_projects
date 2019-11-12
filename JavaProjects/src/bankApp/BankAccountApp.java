package bankApp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Account ckacc1 = new Checking("Tim Wellington", "444102638",1000);
		ckacc1.showInfo();
		
		System.out.println();
		Account savAcc1 = new Savings("Robert Wellington", "104051051",500);
		savAcc1.showInfo();
		// Read csv file and create accounts based on that data

	}

}
