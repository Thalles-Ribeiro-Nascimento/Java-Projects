package exercises.application;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar?");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int max = vetor[0];
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++){
            if (max < vetor[i]){
                max = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("Maior Valor = %d%n", max);
        System.out.printf("Posição do maior valor = %d", posicao);

        sc.close();

    }
}
