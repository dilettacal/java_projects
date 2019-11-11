package studiDBApp;

import java.util.Scanner;

public class StudiDBApp {

	public static void main(String[] args) {

		
		
		// Create n number of new students
		System.out.println("Enter the number of students to enroll:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			Student studi = new Student();
			studi.enroll();
			studi.payTuitionBalance();
			System.out.println(studi.toString());
			students[i] = studi;
		}
		
		for (Student st: students) {
			System.out.println(st);
		}

	}

}
