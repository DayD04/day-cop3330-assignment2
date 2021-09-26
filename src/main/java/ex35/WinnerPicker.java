package ex35;
import java.util.Scanner;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class WinnerPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> selection = new ArrayList<>();

        while (true) {
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if (name.equals("")) {
                break;
            }
            selection.add(name);
        }
        int random = (int)(Math.random() * selection.size());
        System.out.println("The winner is... " + selection.get(random) + ".");
    }
}
