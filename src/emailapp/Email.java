package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String CompanySuffix = "tcs.com";

	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created " + " " + this.firstName + " " + this.lastName);
		// call a method asking for department - return the department
		this.department = setDepartment();
		System.out.println("Department:" + department);

		// call a method that returns a random password
		this.password = randomPassword(8);
		System.out.println("your password is " + password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + CompanySuffix;
		System.out.println("your email is" + email);
	}

	// ask for department
	public String setDepartment() {
		System.out.println(
				"Enter the department \n1 for Sales \n2 for Devolopment \n3 for Accounting \n0 for none\n Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "accounts";
		} else {
			return "";
		}

	}

	// generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// set the mailbox capacity

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	// set the alternate email

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
//		System.out.println("changePassword is ::"+password);
	}

	public int mailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "Display Name::" + " " + firstName + lastName + " " + "company email::" + email + " "+ "MailBoxCapacity::"
				+ mailBoxCapacity + "mb";
	}
}
