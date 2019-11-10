package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email testEmail = new Email("mario", "rossi");
		testEmail.changePassword("New_password");
		System.out.println(testEmail.showInfo());
		
	}

}
