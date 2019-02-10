package ru.ithub.start.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        float a, b, c;
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();

        if(a <= b && a <= c)
        {
            System.out.println("Наименьшее число " + a);
        }
        else if(b <= a && b <= c)
        {
            System.out.println("Наименьшее число " + b);
        }
        else if(c <= a && c <= b){
            System.out.println("Наименьшее число " + c);
        }
        if( a>= b && a >= c)
        {
            System.out.println("Наибольшее число " + a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("Наибольшее число " + b);
        }
        else if(c >= a && c >= b){
            System.out.println("Наибольшее число " + c);
        }

    }
}
