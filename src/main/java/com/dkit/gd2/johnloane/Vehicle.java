package com.dkit.gd2.johnloane;

public class Vehicle
{
    private String name;
    private String size;
    private String propulsionMethod;
    private int passengers;
    private String colour;
    private String type;
    private double cost;

    private int speed;
    private int direction;

    public Vehicle(String name, String size, String propulsionMethod, int passengers, String colour, String type, double cost)
    {
        this.name = name;
        this.size = size;
        this.propulsionMethod = propulsionMethod;
        this.passengers = passengers;
        this.colour = colour;
        this.type = type;
        this.cost = cost;
        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int direction)
    {
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + direction + " degrees");
    }

    public void move(int speed, int direction)
    {
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle.move() moving at " + this.speed + " in direction " + this.direction);
    }

    public void accelerate(int speed)
    {
        this.speed += speed;
        System.out.println("Vehicle.accelerate() moving at " + this.speed);
    }

    public String getName()
    {
        return name;
    }

    public String getSize()
    {
        return size;
    }

    public String getPropulsionMethod()
    {
        return propulsionMethod;
    }

    public int getPassengers()
    {
        return passengers;
    }

    public String getColour()
    {
        return colour;
    }

    public String getType()
    {
        return type;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getDirection()
    {
        return direction;
    }
}
