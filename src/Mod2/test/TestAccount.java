/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mod2.test;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.OverdraftException;
import com.mybank.domain.SavingsAccount;

/**
 *
 * @author Sonya
 */
public class TestAccount {

    public static void main(String[] args) {
        Bank bank = Bank.getBank();

        Customer firstCustomer = new Customer("John", "Doe");
        Customer secondCustomer = new Customer("Jane", "Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);

        displayCustomers(bank);

        bank.getCustomer(0).getAccount(0).deposit(2000);
        try {
            bank.getCustomer(0).getAccount(1).withdraw(5500);
        } catch (OverdraftException ex) {
            System.out.println(ex.getMessage() + ": $" + ex.getDeficit() + "!\n");
        } catch (Exception ex) {
            System.out.println("Something went wrong:" + ex.getMessage());
        }

        ((SavingsAccount) bank.getCustomer(0).getAccount(0)).addInterestRate();

        displayCustomers(bank);

    }

    private static void displayCustomers(Bank bank) {
        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));
    }

}
