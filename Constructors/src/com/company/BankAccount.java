package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(String customerName, String email, int phoneNumber)
    {
        this(999, 102.50, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BankAccount ()
    {
        this(123, 12.50, "Default Name", "Default email", 123);
        System.out.println("\nEmpty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber)
    {
        System.out.println("\nAccount constructors with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getAccountNumber()
    {
        return accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public double depositFunds(double funds)
    {
        System.out.println("\nSuccessfully depositing " + funds + " to the balance " + balance);
        this.balance = this.balance + funds;

        return this.balance;
    }

    public double withdrawFunds(double funds)
    {
        if((this.balance - funds) >= 0)
        {
            System.out.println("\nSuccessfully withdrawing " + funds + " from the balance " + balance);
            this.balance = balance - funds;
        }

        else
        {
            System.out.println("\nError. Insufficient Funds to withdraw " + funds + " from the balance " + balance);
        }

        return this.balance;
    }
}
