package com.bridgelab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to day 19 regex program");
		UserRegistration user=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name to validate");
		String FirstName=sc.next();
		if(user.validate(FirstName)==true) {
			System.out.println("entered first name is valid");
		}else {
			
			System.out.println("entered first name is not valid");
		}
		System.out.println("enter last name to validate");
		String LastName=sc.next();
		if(user.validateLastname(LastName)==true) {
			System.out.println("entered last name is valid");
		}else {
			
			System.out.println("entered last name is not valid");
		}
		System.out.println("enter mail address to validate");
		String mail=sc.next();
		if(user.validateMail(mail)==true) {
			System.out.println("entered mail address is valid");
		}else {
			
			System.out.println("entered mail address is not valid");
		}
		System.out.println("enter pnone number to validate");
		String phone_number=sc.next();
		if(user.validateMobileNumberl(phone_number)==true) {
			System.out.println("entered phone number is valid");
		}else {
			
			System.out.println("entered phone number is not valid");
		}
		

	}

}
