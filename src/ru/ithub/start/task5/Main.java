package ru.ithub.start.task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int A, B;
        A = in.nextInt();
        B = in.nextInt();
        if(A >= B)
            System.out.println("Ошибка, B должно быть больше А");
        else
        {
            int sum = 0;
            for(int i = A; i <= B; i++)
                sum += i;
            System.out.println("Сумма равна " + sum);
        }
    }
}
