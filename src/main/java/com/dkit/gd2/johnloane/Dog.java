package com.dkit.gd2.johnloane;

public class Dog extends Animal
{
    private int legs;
    private String breed;
    private int expectedLifeSpan;
    private int teeth;
    private String gender;
    private boolean pedigree;
    private String colour;

    public Dog(String name, int size, int age, boolean domesticated, double weight, int legs, String breed, int expectedLifeSpan, int teeth, String gender, boolean pedigree, String colour)
    {
        super(name, size, age, domesticated, weight);
        this.legs = legs;
        this.breed = breed;
        this.expectedLifeSpan = expectedLifeSpan;
        this.teeth = teeth;
        this.gender = gender;
        this.pedigree = pedigree;
        this.colour = colour;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    private void rollOver()
    {
        System.out.println("Dog rolling over");
    }

    private void bark()
    {
        System.out.println("Bark, bark, bark");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed)
    {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed)
    {
        System.out.println("Dog.movLegs() called");
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run()
    {
        System.out.println("Dog.run() called");
        super.move(10);
    }
}
