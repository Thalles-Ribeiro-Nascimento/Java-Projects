package exercises.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        double soma = 0.0;
        double media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.println("Valores = " + Arrays.toString(vetor));
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);


    }

}
