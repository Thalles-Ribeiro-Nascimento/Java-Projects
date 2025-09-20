package exercises.application;

import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números Negativos: ");
        for (int numero : vect){
            if (numero < 0){
                System.out.println(numero);
            }
        }

        sc.close();

    }

}
