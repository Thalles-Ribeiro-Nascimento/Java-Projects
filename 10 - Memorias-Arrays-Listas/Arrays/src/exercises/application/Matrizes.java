package exercises.application;
// i = linha
//j = coluna
//              matriz[i][j - 1], matriz[i][j + 1], matriz[i + 1][j]
//              Esquerda          Direita           A baixo

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, x;
        int[][] matriz;

        System.out.println("Digite a quantidades de linhas e colunas da Matriz: ");
        m = sc.nextInt();
        n = sc.nextInt();

        matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        x = sc.nextInt();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == x){
                    System.out.printf("Position: %d,%d%n", linha, coluna);
                    try {
                        System.out.printf("Up: %d%n", matriz[linha - 1][coluna]);
                    }catch (ArrayIndexOutOfBoundsException ignored){
                    }

                    try {
                        System.out.printf("Right: %d%n", matriz[linha][coluna + 1]);
                    }catch (ArrayIndexOutOfBoundsException ignored){
                    }

                    try {
                        System.out.printf("Down: %d%n", matriz[linha + 1][coluna]);
                    }catch (ArrayIndexOutOfBoundsException ignored){
                    }

                    try {
                        System.out.printf("Left: %d%n", matriz[linha][coluna - 1]);
                    }catch (ArrayIndexOutOfBoundsException ignored){
                    }
                }
            }
        }

        sc.close();
    }

}
