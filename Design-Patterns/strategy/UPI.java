package org.example.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("payment using UPI");
    }
}
