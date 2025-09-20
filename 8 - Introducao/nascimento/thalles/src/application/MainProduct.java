package nascimento.thalles.src.application;

import nascimento.thalles.src.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Produto tv = new Produto();

        System.out.println("Entre com o produto: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque: ");
        int quantidade = sc.nextInt();

        tv.setName(nome);
        tv.setPrice(preco);
        tv.setQuantity(quantidade);

        System.out.println(tv);

        System.out.print("Entre com mais quantidades no Estoque: ");
        int quantity = sc.nextInt();
        tv.addProduto(quantity);

        System.out.println(tv);
        sc.close();
    }

}
