package com.tiy.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Brice on 8/15/16.
 */
public class BankAccount {

    LocalDateTime createdDate = LocalDateTime.now();
    LocalDateTime lastTransactionDate;
    private double balance = 0;
    private String name;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        this.lastTransactionDate = LocalDateTime.now();
    }

    public void withdraw(Scanner userInput) {
        System.out.println("How much would you like to withdraw?");
        double withdrawAmount = Integer.valueOf(userInput.nextLine());
        this.balance -= withdrawAmount;
        this.lastTransactionDate = LocalDateTime.now();
    }

    public void deposit(Scanner userInput) {
        System.out.println("How much would you like to deposit?");
        double depositAmount = Double.valueOf(userInput.nextLine());
        this.balance += depositAmount;// + depositAmount;
        this.lastTransactionDate = LocalDateTime.now();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCreatedDate() {
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
        String formatDate = createdDate.format(myFormatter);
        return formatDate;
    }


    public String getLastTransactionDate() {
            DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
            String formatLastDate = lastTransactionDate.format(myFormatter);
        return formatLastDate;
    }

    public void printInfo() {
        System.out.println("Your " + getName() + " account has $" + getBalance() +
                ".\nIt was created " + getCreatedDate() + ".\nLast Transaction was on : " + getLastTransactionDate());
    }



}