package ru.ithub.start.task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        float a, b, c;
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        if(a <= b && a <= c)
        {
            if(b > c)
            {
                float t = c;
                c = b;
                b = t;
            }
        }
        else if(b <= a && b <= c)
        {
            if(a < c)
            {
                float t = a;
                a = b;
                b = t;
            }
            else
            {
                float t = a;
                a = b;
                b = c;
                c = t;
            }
        }
        else if(c <= a && c <= b){
            if(a < b)
            {
                float t = a;
                a = c;
                c = b;
                b = t;
            }
            else
            {
                float t = a;
                a = c;
                c = t;
            }
        }
        System.out.println("Числа в порядке возрастания " + a + " " + b + " " + c);
    }
}
