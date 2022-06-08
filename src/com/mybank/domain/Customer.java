package com.mybank.domain;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Account> accounts;

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    private String lastName;

    private int customerNumber;

    private static int customerNumberBase = 1000;

    private int numOfAccounts;

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo <= accounts.size()) {
            return accounts.get(accNo);
        } else {
            return null;
        }

    }

    public void addAccount(Account acc) {
        accounts.add(acc);
        numOfAccounts++;
    }

    @Override
    public String toString() {
        String s = "Customer{" + "fullName=" + lastName + " " + firstName + ", customerNumber=" + customerNumber + ", numOfAccounts=" + numOfAccounts + '}';
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount) {
                s = s + "\n\t" + (i + 1) + " Savings account with interest rate %" + ((SavingsAccount) acc).getInterestRate();
            } else {
                s = s + "\n\t" + (i + 1) + " Checking account with overdraft $" + ((CheckingAccount) acc).getOverdraftAmount();
            }

            s = s + ", balance $" + acc.getBalance();
        }
        s = s + "\n";
        return s;
    }

}
