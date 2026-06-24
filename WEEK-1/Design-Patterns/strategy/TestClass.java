package org.example.strategy;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Select payment\n 1.Creditcard\n 2.UPI");
        PaymentContext context = new PaymentContext();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your choice for payment");
        int choice = reader.nextInt();
        switch (choice) {
            case 1:
                context.setStrategy(new CreditCard());
                break;
            case 2:
                context.setStrategy(new UPI());
                break;
                default:
                    System.out.println("Invalid choice");
        }
        context.payment();
        System.out.println("Payment done");
    }

}
