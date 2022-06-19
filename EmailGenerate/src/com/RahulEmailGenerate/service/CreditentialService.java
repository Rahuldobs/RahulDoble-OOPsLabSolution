package com.RahulEmailGenerate.service;

import java.util.Random;

import com.RahulEmailGenerate.model.Employee;

public class CreditentialService {

	public char[] generatePass() {

		String capitalLetters = "QWERTYUIOPLKJHGFDSAZXCVBNM";
		String smallLeters = "qwertyuioplkjhgfdsazxcvbnm";
		String specialchar = "!@#$%^&*()_+<>?/.,'}{[]";
		String numbers = "0123456789";

		String values = capitalLetters + smallLeters + specialchar + numbers;
		char[] password = new char[8];
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmailId(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".abc.com";
	}
	public void showResult(Employee employee, String email,char[] generatePassword) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows :");
		System.out.println("Email :- "+ email);	
		System.out.print("Password :- ");
		System.out.println(generatePassword);
	}
}
