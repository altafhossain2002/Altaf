public class PaymentSystem {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean makePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set");
            return false;
        }
        return paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        paymentSystem.setPaymentStrategy(new BankPayment());
        paymentSystem.makePayment(200);

        paymentSystem.setPaymentStrategy(new BkashPayment());
        paymentSystem.makePayment(500);

        paymentSystem.setPaymentStrategy(new CreditCardPayment());
        paymentSystem.makePayment(5500);
    }
}
