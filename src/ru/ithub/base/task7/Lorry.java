package ru.ithub.base.task7;

public class Lorry extends Car {
    @Override
    public void decreaseFuel()
    {
        long stop_time = System.currentTimeMillis();
        double t = (double)(stop_time - super.start_time) * 3 / 1000;
        super.start_time = stop_time;
        super.fuel_level -= t;
        if(super.fuel_level < 0)
            super.fuel_level = 0;
        if(super.fuel_level == 0)
            super.is_goes = false;
    }

}