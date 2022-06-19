package com.RahulEmailGenerate.main;

import com.RahulEmailGenerate.model.Employee;
import com.RahulEmailGenerate.service.CreditentialService;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditentialService cs = new CreditentialService();
		Employee employee = new Employee("Rahul", "Doble");
		String generateEmailAdress;
		// char[] generatedPassword;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Department Option");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();

		switch (option) {
		case 1: {
			generateEmailAdress = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			char[] generatePassword = cs.generatePass();
			cs.showResult(employee, generateEmailAdress, generatePassword);
		}
			break;
		case 2: {
			generateEmailAdress = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			char[] generatePassword = cs.generatePass();
			cs.showResult(employee, generateEmailAdress, generatePassword);
		}
			break;
		case 3: {
			generateEmailAdress = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			char[] generatePassword = cs.generatePass();
			cs.showResult(employee, generateEmailAdress, generatePassword);
		}
			break;
		case 4: {
			generateEmailAdress = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			char[] generatePassword = cs.generatePass();
			cs.showResult(employee, generateEmailAdress, generatePassword);

		}
			break;
		default:
			System.out.println("Invalid Entry");

			sc.close();
		}
	}
}
