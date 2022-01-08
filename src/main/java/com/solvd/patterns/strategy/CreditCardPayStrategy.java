package com.solvd.patterns.strategy;

public class CreditCardPayStrategy implements PayStrategy {

    @Override
    public void pay(Double amount) {
        System.out.printf("Paying %f using credit card\n", amount);
    }
}
