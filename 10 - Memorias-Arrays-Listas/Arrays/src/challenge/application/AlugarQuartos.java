package challenge.application;

import challenge.entities.Alunos;

import java.util.Scanner;

public class AlugarQuartos {
    public static void main(String[] args) {
        int n;
        Alunos aluno;
        Alunos[] quartos = new Alunos[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            aluno = new Alunos();
            System.out.println();
            System.out.printf("Rent #%d:%n", i + 1);
            sc.nextLine();
            System.out.print("Name: ");
            aluno.setNome(sc.nextLine());

            System.out.print("Email: ");
            aluno.setEmail(sc.next());

            System.out.print("Quarto: ");
            int index = sc.nextInt();

            quartos[index] = aluno;

        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.printf("%d: %s%n", i, quartos[i]);
            };
        }

        System.out.println();
        System.out.println("Quartos vazios: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] == null) {
                System.out.printf("%d: Vázio%n", i);
            };
        }

    }
}
