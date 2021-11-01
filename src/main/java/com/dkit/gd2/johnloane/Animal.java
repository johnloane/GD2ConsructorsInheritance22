package com.dkit.gd2.johnloane;

public class Animal
{
    private String name;
    private int size;
    private int age;
    private boolean domesticated;
    private double weight;

    public Animal(String name, int size, int age, boolean domesticated, double weight)
    {
        this.name = name;
        this.size = size;
        this.age = age;
        this.domesticated = domesticated;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public int getSize()
    {
        return size;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isDomesticated()
    {
        return domesticated;
    }

    public double getWeight()
    {
        return weight;
    }

    public void move(int speed)
    {
        System.out.println("Animal.move() called. Animal is moving at speed " + speed);
    }

    public void eat()
    {
        System.out.println("Animal.eat() called");
    }
}
