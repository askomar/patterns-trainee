package strategy;

public class Account {

    private Double money;
    private PayStrategy strategy;

    public Account(Double money, PaymentType type) {
        this.money = money;
        changePayStrategy(type);
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void changePayStrategy(PaymentType type) {
        switch (type) {
            case ETHEREUM:
                strategy = new EthereumPayStrategy();
                break;
            case CREDIT_CARD:
                strategy = new CreditCardPayStrategy();
                break;
            default:
                throw new RuntimeException("There are  no such strategy -" + type);
        }
    }

    public void pay(Double m) {
        strategy.pay(m);
    }
}
