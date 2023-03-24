package com.bridgelab;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validate(String FirstName) {
		Pattern pat = Pattern.compile("^[A-Z][a-z]{3,}");
		boolean matches = pat.matcher(FirstName).matches();
		return matches;
	}

	public boolean validateLastname(String LastName) {
		Pattern pat = Pattern.compile("^[A-Z][a-z]{3,}");
		boolean matches = pat.matcher(LastName).matches();
		return matches;

	}

	public boolean validateMail(String Mail) {
		Pattern pat = Pattern.compile("^[a-z]{5,}[0-9]{3,}@[a-z]{5,}[.]{1}[com]{3}");
		boolean matches = pat.matcher(Mail).matches();
		return matches;

	}

	public boolean validateMobileNumberl(String Mobile) {
		Pattern pat = Pattern.compile("^91\\s[0-9]{10}$");
		boolean matches = pat.matcher(Mobile).matches();
		return matches;

	}

	public boolean validatePassword(String Password) {
		Pattern pat = Pattern.compile("^[a-z]{8}[0-9]{1,}[!@#$%^&*]{1,}[A-Z]{1,}");
		boolean matches = pat.matcher(Password).matches();
		return matches;
	}

	
}