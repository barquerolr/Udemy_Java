package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /****************Challenge********************/
        //Create a new class for a bank account
        //Create fields for the account number, balance, customer name, email and phone number
        //
        //Create getters and setters for each field
        //Create two additional methods
        //1. To allow the customer to deposit funds(this should increment the balance field).
        //2. To allow the customer to withdraw funds(this should deduct from the balance field, but not
            //allow the withdrawal to complete if there are insufficient funds).
        //You will want to create various code in the Main class (the one created by IntelliJ) to confirm
        //  your code is working.
        //Add some System.out.println's in the two methods above as well.

        //BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount = new BankAccount(1492, 1776.50, "Ezio", "ea@gmail.com", 7765445);
//        bankAccount.setAccountNumber(2506);
//        bankAccount.setBalance(985.54);
//        bankAccount.setCustomerName("Ezio Auditore");
//        bankAccount.setEmail("ea@gmail.com");
//        bankAccount.setPhoneNumber(1497150355);

        System.out.println("Account Number = " + bankAccount.getAccountNumber());
        System.out.println("Balance = " + bankAccount.getBalance());
        System.out.println("Name = " + bankAccount.getCustomerName());
        System.out.println("Email = " + bankAccount.getEmail());
        System.out.println("Phone Number = " + bankAccount.getPhoneNumber());

        bankAccount.depositFunds(56.25);
        System.out.println("New balance after depositing = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(1050);
        System.out.println("New balance after withdrawing = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(500);
        System.out.println("New balance after withdrawing = " + bankAccount.getBalance());

        BankAccount ezio = new BankAccount("Tim", "time@email.com", 19520);
        System.out.println(ezio.getAccountNumber() + " name " + ezio.getCustomerName());
        System.out.println("Current balance = " + ezio.getBalance());
        ezio.withdrawFunds(102.5);


        /******************************Challenge************************/
        //Create a new class VIPCustomer
        //It should have 3 fields: name, credit limit, and email address.
        //Create 3 constructors
        //1st constructor empty should call the constructor with 3 parameters with default values
        //2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        //3rd constructor should save all fields
        //Create getters only for this using code generation of intelliJ as setters won't be needed
        //Test and confirm it works

        System.out.println("\n");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Ezio", 100, "ez@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
