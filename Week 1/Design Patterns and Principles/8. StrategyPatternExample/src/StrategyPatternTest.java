public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        context.setPaymentStrategy(creditCard);
        context.executePayment(150.00);
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");
        context.setPaymentStrategy(payPal);
        context.executePayment(200.00);
    }
}