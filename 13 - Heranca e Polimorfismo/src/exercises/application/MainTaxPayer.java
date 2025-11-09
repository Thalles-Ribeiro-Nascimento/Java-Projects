package exercises.application;

import exercises.entities.Company;
import exercises.entities.Individual;
import exercises.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTaxPayer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.printf("Tax payer #%d data:%n", i);
            System.out.print("Individual or company (i/c)? ");
            char op = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual Income: ");
            Double income = sc.nextDouble();

            if (op == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, income, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                taxPayerList.add(new Company(name, income, numberEmployees));
            }

        }

        System.out.println();
        System.out.println("Taxes paid:");
        double soma = 0.0;
        for(TaxPayer taxPayer : taxPayerList){
            System.out.println(taxPayer);
            soma += taxPayer.tax();
        }

        System.out.println();
        System.out.printf("Total Taxes: $ %.2f", soma);

        sc.close();

    }
}
