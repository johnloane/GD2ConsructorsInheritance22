package com.dkit.gd2.johnloane;

public class VipPerson
{
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson()
    {
        this("Default name", 0.00, "default");
    }

    public VipPerson(String name, double creditLimit)
    {
        this(name, creditLimit, "unknown");
    }

    public VipPerson(String name, double creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName()
    {
        return name;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }
}
