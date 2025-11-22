package Exercises.model.services;

import Exercises.model.entities.Contract;
import Exercises.model.entities.Installment;
import Exercises.model.interfaces.OnlinePaymentService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(contract.getDateContract());
        double valueInstallment = contract.getValueContract() / months;

        for (int i = 1; i <= months ; i++) {
            cal.add(Calendar.MONTH, 1);
            String novaData = simpleDateFormat.format(cal.getTime());
            Date date = simpleDateFormat.parse(novaData);

            double interest = onlinePaymentService.interest(valueInstallment, i);
            double paymentFee = onlinePaymentService.paymentFee(interest);

            contract.addInstallments(new Installment(date, paymentFee));

        }
    }
}
