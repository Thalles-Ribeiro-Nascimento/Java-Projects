package nascimento.thalles.src.controllers;

import nascimento.thalles.src.entities.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoController {

    private final ArrayList<Produto> produtos = new ArrayList<>();
//    private Produto produto = new Produto();

    public ProdutoController(){
        System.out.println("Selecione uma das opções: ");
    }

    public void menu(){
        System.out.printf("1 - Adicionar Produto%n" +
                "2 - Excluir produto%n" +
                "3 - Listar produtos%n" +
                "4 - Listar 1 produto%n" +
                "5 - Encerrar programa%n" +
                "Opção: ");
    }

    public void addProduto(Scanner sc){
        System.out.println("Quantos produtos deseja armazenar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            if (i == 0){
                System.out.println("Adicione um produto");
            }else{
                System.out.println("Adicione mais um produto");
            }

            System.out.print("Nome do produto: ");
            String name = sc.next();
            System.out.print("Preço do Produto: ");
            double price = sc.nextDouble();
            System.out.print("Quantidade do produto: ");
            int quantity = sc.nextInt();

            Produto product = new Produto();

            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);

            produtos.add(product);
        }
    }

    public void listarProdutos(){
        System.out.println("Produtos: ");
        System.out.println(produtos);
    }

    public void excluirProduto(Scanner sc){
        System.out.print("Selecione o produto que deseja excluir: ");
        int indice = sc.nextInt();
        produtos.remove(indice);

        System.out.println("Produto excluído!");
    }

    public void listarProdutoById(Scanner sc){
        System.out.print("Fale o produto que deseja: ");
        int index = sc.nextInt();
        System.out.println(produtos.get(index));
    }

//    public void addQuantityStock(Scanner sc){
//        System.out.println("Digite o ");
//    }
//
}
