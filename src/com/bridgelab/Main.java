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

	}

}
