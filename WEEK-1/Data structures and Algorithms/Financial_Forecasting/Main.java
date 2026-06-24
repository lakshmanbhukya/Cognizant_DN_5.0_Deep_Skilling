package org.example.Financial_Forecasting;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static double getForecast(double amount, double interest, int time) {
        if (time <= 0) {
            return amount;
        }
        double new_amount = amount * (1 + (interest / 100.0));
        return getForecast(new_amount, interest, time - 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Financial_Forecasting");

        System.out.println("Please enter Amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Please enter Interest:");
        double interest = scanner.nextInt();

        System.out.println("Please enter Time: ");
        int time = scanner.nextInt();

        double result = getForecast(amount, interest, time);
        String Final_Amount = String.format("%.2f", result);

        System.out.println("Forecast Result: " + Final_Amount);
    }
}
