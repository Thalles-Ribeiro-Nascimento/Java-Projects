package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite uma altura: ");
            vect[i] = sc.nextDouble();


        }

        double soma = 0.0;
        for (int i = 0; i<n; i++){
            soma += vect[i]; // Acumulando valores dentro da variável Soma

        }

        double media = soma / n;

        System.out.println(media);

        sc.close();
    }
}
