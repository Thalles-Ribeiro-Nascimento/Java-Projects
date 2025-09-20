package exercises.application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        double media, soma;
        double[] vetor = new double[n];

        soma = 0.0;
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%d) ", i + 1);
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.printf("Media do vetor: %.3f%n", media);
        System.out.println("Elementos abaixo da média: ");
        for (double itens : vetor){
            if (itens < media){
                System.out.println(itens);
            }
        }


        sc.close();



    }

}
