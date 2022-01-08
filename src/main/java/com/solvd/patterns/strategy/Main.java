package com.solvd.patterns.strategy;

/**
 * Паттерн стратегия нужен, когда нам необходимо выполнять некую функциональность ( к примеру оплату на сайте) различными
 * способами, меняя этот самый способ во время выполнения
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account(1000D, PaymentType.CREDIT_CARD);
        account.pay(10D);
        account.changePayStrategy(PaymentType.ETHEREUM);
        account.pay(200D);
    }
}
