package exercises.application;

import exercises.entities.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Altura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        sc.nextLine();
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++){
            Pessoa pessoa = new Pessoa();
            System.out.printf("Dados da %da pessoa:%n", (i + 1));

            System.out.print("Nome: ");
            pessoa.setNome(sc.next());

            System.out.print("Idade: ");
            pessoa.setIdade(sc.nextInt());
            sc.nextLine();

            System.out.print("Altura: ");
            pessoa.setAltura(sc.nextDouble());

            vetor[i] = pessoa;
            soma += pessoa.getAltura();
            sc.nextLine();
        }

        double media = soma / vetor.length;

        List<String> nomes = new ArrayList<>();

        for (Pessoa pessoa : vetor){
            if (pessoa.getIdade() < 16){
                nomes.add(pessoa.getNome());
            }
        }
        double mediaMenorIdade = nomes.size()  * 100.0 / vetor.length;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", media);
        System.out.println("Pessoas com menos de 16 anos: " + mediaMenorIdade + "% ");

        for (String nome : nomes){
            System.out.println(nome);
        }

        sc.close();

    }
    
}
