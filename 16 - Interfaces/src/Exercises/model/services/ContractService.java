package Exercises.model.services;

import Exercises.model.entities.Contract;
import Exercises.model.entities.Installment;
import Exercises.model.interfaces.OnlinePaymentService;
import java.text.ParseException;
import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) throws ParseException {
        double valueInstallment = contract.getValueContract() / months;

        for (int i = 1; i <= months ; i++) {
            LocalDate dueDate = contract.getDateContract().plusMonths(i);

            double interest = onlinePaymentService.interest(valueInstallment, i);
            double paymentFee = onlinePaymentService.paymentFee(valueInstallment + interest);
            double quota = valueInstallment + interest + paymentFee;

            contract.addInstallments(new Installment(dueDate, quota));

        }
    }
}
