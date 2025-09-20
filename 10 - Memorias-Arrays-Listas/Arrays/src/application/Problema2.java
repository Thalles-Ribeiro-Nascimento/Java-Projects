package application;

import entities.Produto;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produto[] produtos = new Produto[n];

        for (int i = 0; i < produtos.length; i++){
            System.out.print("Digite o Nome do produto:");
            String nome = sc.next();

            System.out.print("Digite o Valor: ");
            double preco = sc.nextDouble();
            System.out.println();

            Produto produto = new Produto(nome, preco);

            produtos[i] = produto;
        }

        double soma = 0.0;

        for (Produto produto : produtos){
            System.out.println(produto);
            soma += produto.getPreco();
        }

        double media = soma / produtos.length;

        System.out.printf("Média de preço: R$ %.2f",media);
        sc.close();

    }
}
