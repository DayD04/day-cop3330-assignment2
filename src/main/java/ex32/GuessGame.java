package ex32;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class GuessGame {

    static boolean answers(int number, int rand) {
        return number != rand;
    }

    static void Guessing(int number, int rand, int guesses) {
        if (number == rand) {
            System.out.println("You got it in " + guesses + " guesses!");
        }
        if (number > rand) {
            System.out.print("Too high. Guess again: ");
        }
        if (number < rand) {
            System.out.print("Too low. Guess again: ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ans = true;
        int range = 0;
        int rand;
        int guesses = 0;

        System.out.println("Let's play guess the number!");
        System.out.println();

        while (true) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String difficult = input.next();

            if (! difficult.matches("[1-3]")) {
                System.out.println("Please enter a number, not a letter.");
            }
            if (difficult.equals("1")) {
                range = 10;
            }
            if (difficult.equals("2")) {
                range = 100;
            }
            if (difficult.equals("3")) {
                range = 1000;
            }

            rand = (int)(Math.random() * range) + 1;
            System.out.print("I have my number. What's your guess? ");
            while (ans) {

                    int guess = input.nextInt();
                    guesses += 1;
                    Guessing(guess, rand, guesses);
                    ans = answers(guess, rand);

            }
            ans = true;

            System.out.println();
            System.out.print("Do you want to play again (y/n)? ");
            String play = input.next();

            if (play.equals("n") || play.equals("N")) {
                break;
            }
        }


    }

}
