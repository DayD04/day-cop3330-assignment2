package ex29;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rate;

        while (true) {
            System.out.print("What is the rate of return? ");
            try {
                rate = Integer.parseInt(input.next());

                if (rate == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }

                System.out.println("It will take " + (72 / rate) + " years to double your initial investment.");

                break;
            }

            catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
            }


        }

    }
}
