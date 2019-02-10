package ru.ithub.base.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car;
        Scanner in = new Scanner(System.in);
        Boolean exit = false;
        System.out.println("Выбрать машину: ");
        System.out.println("1 -  легковая");
        System.out.println("2 -  грузовик");
        int n = in.nextInt();
        if(n==1)
            car = new Car();
        else
            car = new Lorry();
        while (!exit) {
            System.out.println("1 -  запустить машину");
            System.out.println("2 -  проверить, едет ли машина");
            System.out.println("3 -  дозаправить машину");
            System.out.println("4 -  остановить машину");
            System.out.println("5 -  выход");
            n = in.nextInt();
            switch (n) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.isGoes();
                    break;
                case 3:
                    car.refuel();
                    break;
                case 4:
                    car.stop();
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }
    }
}
