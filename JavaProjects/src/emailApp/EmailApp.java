package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email testEmail = new Email("mario", "rossi");
		System.out.println("Department: " + testEmail.getDepartment());
	}

}
