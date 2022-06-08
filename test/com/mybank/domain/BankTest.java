/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mybank.domain;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sonya
 */
public class BankTest {

    Bank bank = Bank.getBank();

    Customer firstCustomer = new Customer("John Doe");
    Customer secondCustomer = new Customer("Jane Doe");

    public BankTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getBank method, of class Bank.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank - only one instance of Bank");
        Bank expResult = bank;
        Bank result = Bank.getBank();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int custNo = 0;
        Bank instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer(custNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer newCustomer = null;
        Bank instance = null;
        instance.addCustomer(newCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfClients method, of class Bank.
     */
    @Test
    public void testGetNumOfClients() {
        System.out.println("getNumOfClients");
        Bank instance = null;
        int expResult = 0;
        int result = instance.getNumOfClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
