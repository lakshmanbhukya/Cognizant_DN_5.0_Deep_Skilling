package org.example.strategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment Using CreditCard");
    }
}
