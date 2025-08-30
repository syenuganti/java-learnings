package behavioral.strategy;

/**
 * Strategy interface defines the contract for all payment strategies
 */
public interface PaymentStrategy {
    void pay(int amount);
    boolean validatePayment();
}
