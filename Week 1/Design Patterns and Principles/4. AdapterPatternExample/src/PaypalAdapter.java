public class PaypalAdapter implements PaymentProcessor {
    private Paypal paypal;

    public PaypalAdapter(Paypal paypal)
    {
        this.paypal=paypal;
    }
    @Override
    public void processPayment(double amount) {
        paypal.paypalPayment(amount);
    }

}
