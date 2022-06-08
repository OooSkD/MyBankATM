/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mybank.domain;

/**
 *
 * @author Sonya
 */
public class Account {

    protected double balance;

    public Account() {
        balance=0;
    }

    /**
     * Constructors that provides initial balance
     * @param balance must be positive
     */
    protected Account(double balance) {
        if (this.balance <= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    /**
     * Method to add money to account
     * @param amt a positive amount of money 
     */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }
    /**
     * Method to withdraw money to account
     * @param amt a positive amount of money 
     */
    public boolean withdraw(double amt) throws Exception {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        throw new OverdraftException(amt -balance,"Error! Insufficient funds");
    }

    /**
     * Method to check account balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

}
