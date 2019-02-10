package ru.ithub.start.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        float a, b, c;
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        System.out.print("Сумма двух наибольших чисел равна ");
        if(a<= b && a <= c)
        {
            System.out.print(b + c);
        }
        else if(b <= a && b <= c)
        {
            System.out.print(a + c);
        }
        else if(c <= a && c <= b){
            System.out.print(a + b);
        }
    }
}

