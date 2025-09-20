package src.exercises.application;

import src.exercises.entities.ContaCorrente;

import java.util.Locale;
import java.util.Scanner;

public class MainContaCorrente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos criar sua conta corrente!");

        System.out.print("Entre com o número da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre com o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Deseja realizar um depósito? (y or n): ");
        String option = sc.next();


        if (option.equalsIgnoreCase("y")) {
            System.out.print("Realize o depósito: ");
            double valorSaldo = sc.nextDouble();

            ContaCorrente conta = new ContaCorrente(numeroConta, nomeTitular, valorSaldo);
            System.out.println(conta);

            System.out.println("Realize um depósito:");
            System.out.print("Depósito: R$");
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println();
            System.out.println(conta);

            System.out.println("Realize um saque:");
            System.out.print("Saque: R$");
            double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
            System.out.println();
            System.out.println(conta);

        }

        else if (option.equalsIgnoreCase("n")){
            ContaCorrente conta = new ContaCorrente(numeroConta, nomeTitular);
            System.out.println(conta);

            System.out.println("Realize um depósito:");
            System.out.print("Depósito: R$");
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println();
            System.out.println(conta);

            System.out.println("Realize um saque:");
            System.out.print("Saque: R$");
            double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
            System.out.println();
            System.out.println(conta);

        }

        else {
            System.out.println("Opção Inválida!");
            sc.close();
        }



        sc.close();


    }

}
