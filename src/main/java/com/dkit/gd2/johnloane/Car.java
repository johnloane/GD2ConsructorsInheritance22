package com.dkit.gd2.johnloane;

public class Car extends Vehicle
{
    private int doors;
    private int wheels;
    private int gears;
    //private Engine engine;
    private String fuelType;
    private boolean horn;
    private int mirrors;
    private int seats;
    private int mileage;
    private int lights;
    private String model;
    private String manufacturer;
    private String brakes;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, String propulsionMethod, int passengers, String colour, String type, double cost, int doors, int wheels, int gears, String fuelType, boolean horn, int mirrors, int seats, int mileage, int lights, String model, String manufacturer, String brakes, boolean isManual)
    {
        super(name, size, propulsionMethod, passengers, colour, type, cost);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.fuelType = fuelType;
        this.horn = horn;
        this.mirrors = mirrors;
        this.seats = seats;
        this.mileage = mileage;
        this.lights = lights;
        this.model = model;
        this.manufacturer = manufacturer;
        this.brakes = brakes;
        this.isManual = isManual;
        this.currentGear = 0;
    }

    public void changeGear(int currentGear)
    {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() now in " + this.currentGear + " gear");
    }

    public void beepHorn()
    {
        System.out.println("Beeeeeeeeeeppppppppp! Beeeeeeppppppppp!!!");
    }
}
