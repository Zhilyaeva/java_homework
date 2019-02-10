package ru.ithub.start.task8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int N;
        N = in.nextInt();
        int sum = 0;
        while (N != 0)
        {
            sum += N % 10;
            N /= 10;
        }
        System.out.println("Сумма всех цифр числа "+sum);
    }
}
