public class AdapterTest
{
    public static void main(String[] args)
    {
        Paypal paypal=new Paypal();
        GPay gpay=new GPay();
        PhonePe phonepe=new PhonePe();

        PaymentProcessor p1=new PaypalAdapter(paypal);
        PaymentProcessor p2=new GPayAdapter(gpay);
        PaymentProcessor p3=new PhonePeAdapter(phonepe);

        p1.processPayment(1000);
        p2.processPayment(5000);
        p3.processPayment(8000);
    }
}
