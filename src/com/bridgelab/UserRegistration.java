package com.bridgelab;

import java.util.regex.Pattern;

public class UserRegistration {
 public boolean validate(String FirstName) {
	 Pattern pat=Pattern.compile("^[A-Z][a-z]{3,}");
	 boolean matches=pat.matcher(FirstName).matches();
	 return matches;
 }
 public boolean validateLastname(String LastName) {
	 Pattern pat=Pattern.compile("^[A-Z][a-z]{3,}");
	 boolean matches=pat.matcher(LastName).matches();
	 return matches;
 
}
}