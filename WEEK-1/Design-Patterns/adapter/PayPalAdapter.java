package org.example.adapter;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalGateway paypal;
    public PayPalAdapter(PayPalGateway paypal) {
        this.paypal = paypal;
    }
    @Override
    public void processPayment() {
        paypal.PayPalPayment();
    }
}
