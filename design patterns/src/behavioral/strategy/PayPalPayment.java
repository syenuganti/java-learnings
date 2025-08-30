package behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        if (validatePayment()) {
            System.out.println("Paying " + amount + " using PayPal account: " + email);
        } else {
            System.out.println("PayPal payment failed!");
        }
    }

    @Override
    public boolean validatePayment() {
        // Simplified validation
        return email != null && email.contains("@") && password != null && password.length() >= 8;
    }
}
