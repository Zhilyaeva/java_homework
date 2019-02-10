package ru.ithub.base.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner in = new Scanner(System.in);
        Boolean exit = false;
        while(!exit) {
            System.out.println("1 -  запустить машину");
            System.out.println("2 -  проверить, едет ли машина");
            System.out.println("3 -  дозаправить машину");
            System.out.println("4 -  остановить машину");
            System.out.println("5 -  выход");
            int n = in.nextInt();
            switch (n)
            {
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
