package ru.ithub.base.task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        while(car.isGoes());
        car.refuel();
        while(car.getFuelLevel() > 10);
        car.stop();
    }
}
