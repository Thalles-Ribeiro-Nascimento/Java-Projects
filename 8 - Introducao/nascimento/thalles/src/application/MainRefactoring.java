package nascimento.thalles.src.application;

import nascimento.thalles.src.controllers.ProdutoController;

import java.util.Locale;
import java.util.Scanner;

public class MainRefactoring {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int option;
        ProdutoController produtoController = new ProdutoController();

        do{
            produtoController.menu();
            option = sc.nextInt();

            switch (option){
                case 1 -> produtoController.addProduto(sc);
                case 2 -> produtoController.excluirProduto(sc);
                case 3 -> produtoController.listarProdutos();
                case 4 -> produtoController.listarProdutoById(sc);
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente");
            }
        }while (option != 5);

        sc.close();

    }
}
