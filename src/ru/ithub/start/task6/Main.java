package ru.ithub.start.task6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int N;
        N = in.nextInt();
        if (N <= 2)
            System.out.println("Ошибка, N должно быть больше 2");
        else
        {
            int a1 = 1, a2 = 1, a3 = 1, a;
            System.out.print(a1);
            System.out.print(" ");
            System.out.print(a2);
            System.out.print(" ");
            System.out.print(a3);
            for(int i = 3; i < N; i++)
            {
                a = a3 +a2 -2 * a1;
                a1 = a2;
                a2 = a3;
                a3 = a;
                System.out.print(" ");
                System.out.print(a);
            }
        }
    }
}
