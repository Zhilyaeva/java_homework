package ru.ithub.base.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = in.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Введите матрицу: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("Строка %d ",i+1);
            for (int j = 0; j < n; j++) {
                A[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int t = A[i][j];
                A[i][j] = A[n - 1 - j][n - 1 - i];
                A[n - 1 - j][n - 1 - i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }
    }
}
