package Exercises.application;

import Exercises.model.entities.Contract;
import Exercises.model.entities.Installment;
import Exercises.model.services.ContractService;
import Exercises.model.services.InfinitePayService;
import Exercises.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContractService contractService = new ContractService(new InfinitePayService());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int numberContract = sc.nextInt();
        sc.nextLine();

        System.out.print("Data: ");
        Date dateContract = simpleDateFormat.parse(sc.nextLine());

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
