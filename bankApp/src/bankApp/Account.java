package bankApp;

import java.util.Scanner;

public class Account {
	//Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	//Depositing money
	void deposit(int amount ) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//Withdraw money
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = amount;
		}
	}
	
	//Previous transaction
	
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn ; " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction ocurred");
		}
	}
	
	// Function calculations interest of funds x years
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + "years, your balance will be: " + newBalance);
		}
	
	//Menu function
	void showMenu() {
		char option = '\0';
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome, " + customerName + "!");
			System.out.println("Your ID is: " + customerID);
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("A. Check your balance");
			System.out.println("B. Make a deposit");
			System.out.println("C. Make a withdrawl");
			System.out.println("D. View previous transaction");
			System.out.println("E. Calculate interest");
			System.out.println("F. Exit");
			
			do {
				System.out.println();
				System.out.println("Entre a option: ");
				char option1 = sc.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				// 'A' check account
				case 'A':
					System.out.println("===================================");
					System.out.println("Balance = € " + balance);
					System.out.println("===================================");
					System.out.println();
					break;
				
				// 'B' deposit money
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					int amount = sc.nextInt();
					deposit (amount);
					System.out.println();
					break;
					
				// 'C' withdraw money
				case 'C':
					System.out.println("Enter an amount to withdraw: ");
					int amount2 =sc.nextInt();
					withdraw(amount2);
					System.out.println();
					break;
					
				// 'D' view most recent transaction
				case 'D':
					System.out.println("===================================");
					getPreviousTransaction();
					System.out.println("===================================");
					System.out.println();
					break;
				
				// 'E' calculates interest
				case 'E':
					System.out.println("Enter how many years of accried interest: ");
					int years = sc.nextInt();
					calculateInterest(years);
					break;
					
				//Case 'F' exit
				case'F':
					System.out.println("===================================");
					break;
					
				
				default:
					System.out.println("Error: invalid option. PLease enter A, B, C, D, E, ou F to acess our services");
					break;
				}
				
			
			}while(option != 'F');
		}
		System.out.println("Thank you for banking with us");
		
	}
}
		
	
