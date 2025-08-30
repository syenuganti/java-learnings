package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        if (validatePayment()) {
            System.out.println("Paying " + amount + " using Credit Card");
        } else {
            System.out.println("Credit Card payment failed!");
        }
    }

    @Override
    public boolean validatePayment() {
        // Simplified validation
        return cardNumber != null && cardNumber.length() == 16 && cvv != null && cvv.length() == 3;
    }
}
