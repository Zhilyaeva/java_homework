package ru.ithub.base.task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][n];
        System.out.println("Введите матрицу: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("Строка %d ",i+1);
            for (int j = 0; j < m; j++) {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[j][i] = A[i][j];
            }
        }

        System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", B[i][j]);
            }
            System.out.println();
        }
    }
}

