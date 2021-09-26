package ex25;

import java.util.Scanner;

/***
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class App {
    //checks of the password is more than 8 characters, has a number, a letter (lowercase) and a special
    //character before giving it a rank out of 4, 1 being very weak and 4 being very strong.
    static int passwordValidator(String str) {
        int score = 0;

        if (str.length() >= 8) {
            score += 1;
        }
        if (str.matches("(?=.*[0-9]).*")) {
            score += 1;
        }
        if (str.matches("(?=.*[a-z]).*")) {
            score += 1;
        }
        if (str.matches("(?=.*[~!@#$%^&*()-]).*")) {
            score += 1;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password to be evaluated: ");
        String password = input.next();

        int strength = passwordValidator(password);

        if (strength == 0) {
            System.out.println("Password can not be evaluated. Please input a different password.");
        }
        if (strength == 1) {
            System.out.println("The password " + password + " is a very weak password.");
        }
        if (strength == 2) {
            System.out.println("The password " + password + " is a weak password.");
        }
        if (strength == 3) {
            System.out.println("The password " + password + " is a strong password.");
        }
        if (strength == 4) {
            System.out.println("The password " + password + " is a very strong password.");
        }
    }
}
