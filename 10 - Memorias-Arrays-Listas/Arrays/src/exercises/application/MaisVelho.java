package exercises.application;

import exercises.entities.Pessoa2;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa2 pessoa;

        System.out.print("Quantas pessoas você vai cadastrar? ");
        int n = sc.nextInt();
        Pessoa2[] vetor = new Pessoa2[n];

        sc.nextLine();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoa = new Pessoa2(nome, idade);
            vetor[i] = pessoa;

            sc.nextLine();
        }

        int max = vetor[0].idade();
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++){
            if (max < vetor[i].idade()){
                max = vetor[i].idade();
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s%n", vetor[posicao].nome());

        for (Pessoa2 people : vetor){
            System.out.println(people);
        }

        sc.close();

    }

}
