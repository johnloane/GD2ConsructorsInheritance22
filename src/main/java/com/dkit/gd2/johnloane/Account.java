package com.dkit.gd2.johnloane;

public class Account
{
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String customerPhoneNumber;

    public Account()
    {
        this("Unknown", 0.00, "Default name", "Default email address", "Default Phone Number");
    }

    public Account(String number, double balance, String customerName, String emailAddress, String customerPhoneNumber)
    {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount)
    {
        if(this.balance - withdrawalAmount < 0)
        {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
        else
        {
            this.balance -= withdrawalAmount;
        }
    }

    public double getBalance()
    {
        return balance;
    }
}
