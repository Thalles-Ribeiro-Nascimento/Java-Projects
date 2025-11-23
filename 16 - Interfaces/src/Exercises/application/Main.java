package Exercises.application;

import Exercises.model.entities.Contract;
import Exercises.model.entities.Installment;
import Exercises.model.services.ContractService;
import Exercises.model.services.InfinitePayService;
import Exercises.model.services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContractService contractService = new ContractService(new PaypalService());

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int numberContract = sc.nextInt();

        System.out.print("Data: ");
        LocalDate dateContract = LocalDate.parse(sc.next());

        System.out.print("Valor: ");
        double valueContract = sc.nextDouble();

        Contract contract = new Contract(numberContract, dateContract, valueContract);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installment parcelas : contract.getInstallmentsList()){
            System.out.print(parcelas);
        }

        sc.close();
    }
}
