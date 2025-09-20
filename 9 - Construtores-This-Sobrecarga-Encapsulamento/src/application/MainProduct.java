package src.application;

import src.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o produto: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

//        System.out.print("Estoque: ");
//        int quantidade = sc.nextInt();

        Produto tv = new Produto(nome, preco);

        System.out.println(tv);

        System.out.print("Entre com mais quantidades no Estoque: ");
        int quantity = sc.nextInt();
        tv.addProduto(quantity);

        System.out.println(tv);
        sc.close();
    }

}
