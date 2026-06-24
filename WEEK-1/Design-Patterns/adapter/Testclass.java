package org.example.adapter;

public class Testclass {
    public static void main(String[] args) {
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalProcess=new PayPalAdapter(paypal);
        System.out.println("Routing Client Request to PayPal Adapter...");
        paypalProcess.processPayment();

        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripePayment=new StripeAdapter(stripe);
        System.out.println("Routing Client Request to Stripe Adapter...");
        stripePayment.processPayment();
    }
}
