package Exercises.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contract {
    private int numberContract;
    private LocalDate dateContract;
    private double valueContract;

    private List<Installment> installmentsList = new ArrayList<>();

    public Contract(int numberContract, LocalDate dateContract, double valueContract) {
        this.numberContract = numberContract;
        this.dateContract = dateContract;
        this.valueContract = valueContract;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public double getValueContract() {
        return valueContract;
    }

    public void addInstallments(Installment installment){
        installmentsList.add(installment);
    }

    public List<Installment> getInstallmentsList() {
        return installmentsList;
    }

    //
//    @Override
//    public String toString() {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String dateContractFormat = simpleDateFormat.format(getDateContract());
//        return String.format("Contrato:%n" +
//                "Número: %d%n" +
//                "Data: %s%n" +
//                "Valor: $ %.2f",
//                getNumberContract(),
//                dateContractFormat,
//                getValueContract());
//    }
}
