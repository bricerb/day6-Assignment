package com.tiy.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6Runner {
//	ArrayList<Bank> myAccountsIndex = new ArrayList<BankAccount>();

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Welcome to your new Bank!");
		System.out.println();
		System.out.println("Name your new bank:");
		Bank myBank = new Bank(userInput.nextLine());
		System.out.println("Please create your first account.");
		myBank.addAccount(userInput);

		while (true) {
			try {
				System.out.println("\nWelcome to " + myBank.getName() + "\n");
				System.out.println();

				while(true) {
					System.out.println("What would you like to do?\n");
					System.out.println("1. Add a Bank Account.");
					System.out.println("2. Select an Account");
					System.out.println("3. Print all bank information.");
					System.out.println("\n0. Walk out of the bank");
					int userChoice = Integer.valueOf(userInput.nextLine());
					if (userChoice == 0) {
						break;
					} else if (userChoice == 3) {
						myBank.printInfo();
					} else if (userChoice == 1) {
						myBank.addAccount(userInput);
					} else if (userChoice == 2) {
						int index = 1;
						ArrayList<BankAccount> myAcctIndex = myBank.getMyAccountsIndex();
						for (BankAccount currAcct : myAcctIndex) {
							System.out.println(index + ". " + currAcct.getName() + ": " + currAcct.getBalance());
							index ++;
						}

						System.out.println("Which account would you like to use?");
						userChoice = Integer.valueOf(userInput.nextLine());
						BankAccount myAccount = myAcctIndex.get(userChoice - 1);

						while (true) {
							System.out.println("What would you like to do with your " + myAccount.getName() + " account?");
							System.out.println("1. Make a deposit.");
							System.out.println("2. Make a withdrawal.");
							System.out.println("3. Print account information.");
							System.out.println();
							System.out.println("0. Return to Bank");
							userChoice = Integer.valueOf(userInput.nextLine());
							if (userChoice == 1) {
								myAccount.deposit(userInput);
							} else if (userChoice == 2) {
								myAccount.withdraw(userInput);
							} else if (userChoice == 3) {
								myAccount.printInfo();
							} else if (userChoice == 0) {
								break;
							}
						}
					}
				}
			} catch(Exception exception) {
				System.out.println("Invalid Choice. Please Try again.");
			}
		break;
		}
	}
}