package exercises.application;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        double somaPares = 0.0;
        double media;
        int cont = 0;

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%d) ", i + 1);
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0){
                cont++;
                somaPares += vetor[i];
            }
        }

        if (cont > 0){
            media = somaPares / cont;
            System.out.printf("Media dos pares = %.1f", media);
        }else{
            System.out.println("Nenhum número par");
        }


        sc.close();

    }
}
