package exercises.model.entities;

import exercises.model.exceptions.WithDrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit (Double amount){
        this.balance += amount;
    }

    public void withDraw(Double amount) throws WithDrawException {
        if (this.balance < 1 || amount > this.balance){
            throw new WithDrawException("Withdraw error: Not enough balance");
        }
        if (this.withDrawLimit < amount){
            throw new WithDrawException("Withdraw error: The amount exceeds withdraw limit");
        }
        this.balance -= amount;
        System.out.printf("New Balance: $ %.2f", this.balance);

    }

}
