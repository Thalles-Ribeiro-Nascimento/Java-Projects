package application;

import java.util.Scanner;

public class MainMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%d ", matriz[i][i]);
        }

        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.printf("Negative Numbers = %d", cont);

    }
}
