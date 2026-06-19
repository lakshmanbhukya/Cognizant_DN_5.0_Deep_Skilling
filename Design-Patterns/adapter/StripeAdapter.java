package org.example.adapter;

public class StripeAdapter implements PaymentProcessor {
    private final StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe){
       this.stripe=stripe;
    }
    @Override
    public void processPayment() {
        stripe.StripePayment();
    }
}
