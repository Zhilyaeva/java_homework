package ru.ithub.start.task4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int N;
        N = in.nextInt();
        Boolean has2 = false;
        while (N != 0)
        {
            if(N % 10 == 2) {
                has2 = true;
            }
            N /= 10;
        }
        System.out.println(has2);
    }
}