package ru.ithub.base.task4;

public class Car {
    public static final int MAX_FUEL = 15;

    public Car() {
        is_goes = true;
        is_started = false;
        fuel_level = MAX_FUEL;
    }

    public void decreaseFuel()
    {
        long stop_time = System.currentTimeMillis();
        double t = (double)(stop_time - start_time) / 1000;
        start_time = stop_time;
        fuel_level -= t;
        if(fuel_level < 0)
            fuel_level = 0;
        if(fuel_level==0)
            is_goes = false;
    }
    public void start()
    {
        if(fuel_level == 0) {
            System.out.println("No fuel");
            return;
        }
        start_time = System.currentTimeMillis();
        is_started = true;
        System.out.println("Car started");

    }
    public void stop()
    {
        if(!is_started)
        {
            System.out.println("Car wasn't started");
            return;
        }
        decreaseFuel();
        is_started = false;
        System.out.println("Car stopped");
    }
    public Boolean isGoes()
    {
        if(is_goes && is_started)
        {
            decreaseFuel();
        }
        if(is_goes && is_started)
            System.out.println("Car goes");
        else
            System.out.println("Car doesn't go");
        return (is_goes && is_started);
    }
    public void refuel()
    {
        fuel_level = MAX_FUEL;
        is_goes = true;
        System.out.println("Car refueled");
    }
    public int getFuelLevel()
    {
        if(is_goes && is_started)
        {
            decreaseFuel();
        }
        System.out.println("Fuel level is " + fuel_level);
        return fuel_level;
    }

    Boolean is_goes;
    Boolean is_started;
    int fuel_level;
    long start_time;
}
