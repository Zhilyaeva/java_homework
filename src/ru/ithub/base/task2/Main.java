package ru.ithub.base.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры первой матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Введите число столбцов второй матрицы: ");
        int k = in.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][k];
        int[][] C = new int[n][k];
        System.out.println("Введите первую матрицу: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Строка %d ",i+1);
            for (int j = 0; j < m; j++) {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("Введите вторую матрицу: ");
        for (int i = 0; i < m; i++) {
            System.out.printf("Строка %d ",i+1);
            for (int j = 0; j < k; j++) {
                B[i][j] = in.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    C[i][j] += A[i][l] * B[l][j];
                }
            }
        }
        System.out.println("Произведение матриц: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%3d ", C[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
