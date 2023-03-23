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
		Pattern pat = Pattern.compile("^[abc]{3}[.]{1}[a-z]{3}[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]{2}");
		boolean matches = pat.matcher(Mail).matches();
		return matches;

	}

	public boolean validateMobileNumberl(String Mobile) {
		Pattern pat = Pattern.compile("^91\\s[0-9]{10}$");
		boolean matches = pat.matcher(Mobile).matches();
		return matches;

	}

	public boolean validatePassword(String Password) {
		Pattern pat = Pattern.compile("^[a-z0-9]{8}");
		boolean matches = pat.matcher(Password).matches();
		return matches;
	}

	public boolean validatePassword1(String PasswordSpcl) {
		Pattern pat = Pattern.compile("^[a-z0-9]{8}[!@#$%^&*]{1,}");
		boolean matches = pat.matcher(PasswordSpcl).matches();
		return matches;

	}
}