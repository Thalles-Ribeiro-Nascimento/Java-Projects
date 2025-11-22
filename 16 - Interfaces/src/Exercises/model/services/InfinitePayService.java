package Exercises.model.services;

import Exercises.model.interfaces.OnlinePaymentService;

public class InfinitePayService implements OnlinePaymentService {
    private static final double PAYMENTFEE = 0.01;
    private static final double INTEREST = 0.01;


    @Override
    public Double paymentFee(Double amount) {
        return amount + (amount * PAYMENTFEE);
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount + (amount * INTEREST) * months;
    }
}
