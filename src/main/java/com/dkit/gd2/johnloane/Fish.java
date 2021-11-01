package com.dkit.gd2.johnloane;

public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int age, boolean domesticated, double weight, int gills, int eyes, int fins)
    {
        super(name, size, age, domesticated, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {

    }

    private void moveMuscles()
    {

    }

    private void moveBackFin()
    {

    }

    public void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
