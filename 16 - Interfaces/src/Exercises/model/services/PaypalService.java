package Exercises.model.services;

import Exercises.model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
    private static final double PAYMENTFEE = 0.02;
    private static final double INTEREST = 0.01;


    @Override
    public Double paymentFee(Double amount) {
        return amount * PAYMENTFEE;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return (amount * INTEREST) * months;
    }
}
