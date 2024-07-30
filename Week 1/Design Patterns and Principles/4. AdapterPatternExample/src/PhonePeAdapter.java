public class PhonePeAdapter implements PaymentProcessor
{
    private PhonePe phonepe;

    public PhonePeAdapter(PhonePe phonepe)
    {
        this.phonepe=phonepe;
    }
    @Override
    public void processPayment(double amount) {
        phonepe.phonePePayment(amount);
    }
}