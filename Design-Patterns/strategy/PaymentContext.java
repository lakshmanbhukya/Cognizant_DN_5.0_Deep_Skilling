package org.example.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void payment(){
        if(strategy==null){
            System.out.println("Strategy is null");
            return;
        }else{
            strategy.pay();
        }
    }
}
