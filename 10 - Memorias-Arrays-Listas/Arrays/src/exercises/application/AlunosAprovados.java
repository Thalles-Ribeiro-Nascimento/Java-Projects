package exercises.application;

import exercises.entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class AlunosAprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Alunos aluno;
        int n;
        boolean media;

        System.out.print("Digite a quantidade de alunos: ");
        n = sc.nextInt();

        Alunos[] vetor = new Alunos[n];

        sc.nextLine();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno: %n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Primeira Nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Segunda nota: ");
            double nota2 = sc.nextDouble();

            aluno = new Alunos(nome, nota1, nota2);
            vetor[i] = aluno;
        }

        System.out.println("Alunos aprovados: ");
        for (Alunos alunos : vetor){
            if (alunos.media()){
                System.out.println(alunos.nome());
            }
        }


        sc.close();
    }
}
