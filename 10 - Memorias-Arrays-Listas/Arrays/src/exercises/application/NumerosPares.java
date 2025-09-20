package exercises.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        List<Integer> par = new ArrayList<>();


        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0){
                par.add(vetor[i]);
            }
        }

        System.out.println("Números Pares:");
        for (int x : par){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Quantidade de pares = " + par.size());

        sc.close();
    }

}
