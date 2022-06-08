# MyBankATM
<<<<<<< HEAD

In this project, we designed and implemented a prototype ATM/Bank system.

The bank initially registered 2 users: John Doe, Jane Doe. John has a checking and a savings account. Jane only has a checking account. 
John's savings account balance is $1,000 at 5 percent. John's checking account balance is $5,000 with an overdraft of $1,000. 
Jane's checking account balance is $500 with an overdraft of $100.

Clients can use the ATM to create accounts, withdraw/deposit money.

There are three important classes in MyBankATM.

Customer: Responsible for information about user. 
In this class there are methods getLastName and getFirstName, which return the last name and the first name of the user, which are set in the constructor. 
The getAccount method returns an object of the Account class if the user has any bank account. 
addAccount adds a new account to the list of existing user accounts. 
And finally, the overridden method toString returns a string containing the last name, first name, user identification number, number of accounts, brief information about each account, depending on its type and balance.

CheckingAccount: This class is responsible for the checking account. 
It has two methods, one of which is withdraw, an overridden method of the Account class. 
The getOverdraftAmount method returns the account overdraft set in the constructor when creating this account.

SavingsAccount: This class is responsible for the saving account.
It also contains only two methods. addInterestRate increases the balance by the percentage set when creating the account. 
GetInterestRate returns this percentage.

A few words about the methods of the Account class, the parent of CheckingAccount and SavingsAccount: the deposit method deposits money to the account; the withdraw method withdraws money from the account if there is such an amount; getBalance returns the amount of money in the account.


ATM commands:
* connecting to account via id
* check account balance
* make a deposite
* make a withdrawal

