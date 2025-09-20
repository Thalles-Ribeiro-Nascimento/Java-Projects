package exercises.application;

import exercises.entities.GeneroAltura;
import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, nHomens, nMulheres;
        double altura, maxAltura, minAltura, somaMulheres, mediaAlturaMulheres;
        GeneroAltura[] vetor;
        String genero;
        GeneroAltura pessoa;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        vetor = new GeneroAltura[n];

        nHomens = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura = sc.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero = sc.next();

            if (genero.equalsIgnoreCase("m")){
                nHomens++;

                pessoa = new GeneroAltura(altura, genero);

                vetor[i] = pessoa;
            }
            else{
                pessoa = new GeneroAltura(altura, genero);
                vetor[i] = pessoa;
            }
        }

        somaMulheres = 0.0;
        nMulheres = 0;
        for (GeneroAltura itens : vetor){
            if (itens.genero().equalsIgnoreCase("f")){
                somaMulheres += itens.altura();
                nMulheres++;
            }
        }

        maxAltura = vetor[0].altura();
        for (GeneroAltura value : vetor) {
            if (maxAltura < value.altura()) maxAltura = value.altura();
        }

        minAltura = vetor[0].altura();
        for (GeneroAltura generoAltura : vetor) {
            if (minAltura > generoAltura.altura()) minAltura = generoAltura.altura();
        }

        mediaAlturaMulheres = somaMulheres / nMulheres;

        System.out.printf("Menor altura = %.2f%n", minAltura);
        System.out.printf("Maior altura = %.2f%n", maxAltura);
        System.out.printf("Altura média das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Número de homens: %d%n", nHomens);



        sc.close();


    }

}
