package nascimento.thalles.src.application;

import nascimento.thalles.src.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class MainDollar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual valor do Dólar: ");
        double dollar = sc.nextDouble();

        System.out.print("Quantos Dólares quer comprar: ");
        double bought = sc.nextDouble();

        System.out.printf("Você terá que pagar em Reais: R$ %.2f", CurrencyConverter.convert(dollar, bought));

        sc.close();
    }

}
