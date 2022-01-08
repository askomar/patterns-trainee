package strategy;

public class EthereumPayStrategy implements PayStrategy {

    @Override
    public void pay(Double amount) {
        System.out.printf("Pay %f using ethereum\n", amount);
    }
}
