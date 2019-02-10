package ru.ithub.start.task7;
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
            int count = 1;
            for(int i = A; i <= B; i++)
            {
                for(int j = 0; j<count; j++)
                    System.out.println(i);
                count++;
            }
        }
    }
}