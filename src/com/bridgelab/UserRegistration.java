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
 public boolean validateMail(String Mail) {
	 Pattern pat=Pattern.compile("^[abc]{3}[.]{1}[a-z]{3}[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]{2}");
	 boolean matches=pat.matcher(Mail).matches();
	 return matches;

}}