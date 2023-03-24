package com.bridgelab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	UserRegistration user = new UserRegistration();

	@Test
	void testValidateFirstname() {
		boolean result = user.validate("Pavan");
		Assert.assertTrue(result);

	}

	@Test
	void testValidateLastname() {
		boolean result = user.validateLastname("Tigani");
		Assert.assertTrue(result);

	}

	@Test
	void testValidateMobileNumber() {
		boolean result = user.validateMobileNumberl("91 9741288309");
		Assert.assertTrue(result);

	}

	@Test
	void testValidateMail() {
		boolean result = user.validateMail("navap903@gmail.com");
		Assert.assertTrue(result);

	}

	@Test
	void testValidatPassword() {
		boolean result = user.validatePassword("pavanpav123@T");
		Assert.assertTrue(result);

	}
}
