package com.tiy.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brice on 8/15/16.
 */
public class Bank {
//    BankAccount myBankAccount = new BankAccount();
    private String name;
    ArrayList<BankAccount> myAccountsIndex = new ArrayList<BankAccount>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Bank name: " + getName());
            System.out.println("This bank has " + myAccountsIndex.size() + " accoounts.");
    }

    public void addAccount(Scanner userInput) {
        BankAccount myAccount = new BankAccount();
        System.out.println("What will you name this account?");
        myAccount.setName(userInput.nextLine());
        System.out.println("And what is your starting amount in this account?");
        myAccount.setBalance(Double.valueOf(userInput.nextLine()));
        myAccountsIndex.add(myAccount);
    }

    public ArrayList<BankAccount> getMyAccountsIndex() {
        return myAccountsIndex;
    }

    public void setMyAccountsIndex(ArrayList<BankAccount> myAccountsIndex) {
        this.myAccountsIndex = myAccountsIndex;
    }
}