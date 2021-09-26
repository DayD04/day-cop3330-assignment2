package ex31;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your resting heart rate: ");
        int heart = input.nextInt();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Resting Pulse: " + heart + "          Age: " + age);
        System.out.println();
        System.out.println("Intensity     | Rate");
        System.out.println("--------------|------");

        for (int i = 55; i < 100; i = i + 5) {
            double intensity = i / 100.0;
            double targetHeartRate = (((220 - age) - heart) * intensity) + heart;
            if (targetHeartRate >= Math.round(targetHeartRate) + 0.5) {
                targetHeartRate += 1;
            }
            System.out.println(i + "%           | " + Math.round(targetHeartRate) + " bpm");
        }


    }
}
