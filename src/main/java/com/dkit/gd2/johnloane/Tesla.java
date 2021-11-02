package com.dkit.gd2.johnloane;

public class Tesla extends Car
{
    private String autoPilotVersion;
    private boolean dogMode;

    public Tesla(String name, String size, String propulsionMethod, int passengers, String colour, String type, double cost, int doors, int wheels, int gears, String fuelType, boolean horn, int mirrors, int seats, int mileage, int lights, String model, String manufacturer, String brakes, boolean isManual, String autoPilotVersion)
    {
        super(name, size, propulsionMethod, passengers, colour, type, cost, doors, wheels, gears, fuelType, horn, mirrors, seats, mileage, lights, model, manufacturer, brakes, isManual);
        this.autoPilotVersion = autoPilotVersion;
        this.dogMode = false;
    }

    public void beepHorn(String songName)
    {
        System.out.println(songName + " now playing");
    }
}
