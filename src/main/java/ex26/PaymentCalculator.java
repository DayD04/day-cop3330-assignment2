package ex26;

import java.util.Scanner;

public class PaymentCalculator {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 David Day
     */

    static double calculateMonthsUntilPaidOff(double i, double b, double p) {

        i = i / 100.0;
        i = i / 365.0;
        double neg = -(1.0 / 30.0);
        double months = neg * Math.log(1 + b / p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i);
        if (months >= Math.round(months)) {
            months = months + 1;
        }
        return months;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double bal = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthly = input.nextDouble();

        double months = calculateMonthsUntilPaidOff(apr, bal, monthly);
        System.out.println("It will take you " + Math.round(months) + " months to pay off this card.");
    }

}
