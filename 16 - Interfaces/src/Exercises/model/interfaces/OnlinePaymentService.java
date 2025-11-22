package Exercises.model.interfaces;

public interface OnlinePaymentService {

    Double paymentFee(Double amount); // Taxa de pagamento
    Double interest(Double amount, Integer months); // Juros mensais
}
