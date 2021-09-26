package ex33;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class Magic8 {

    static int rand = (int)(Math.random() * 4);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your question? ");
        System.out.print("> ");
        String question = input.next();
        System.out.println();

        switch (rand) {
            case 0: {
                System.out.println("Yes");
                break;
            }
            case 1: {
                System.out.println("No");
                break;
            }
            case 2: {
                System.out.println("Maybe");
                break;
            }
            case 3: {
                System.out.println("Ask again later.");
                break;
            }
        }
    }

}
