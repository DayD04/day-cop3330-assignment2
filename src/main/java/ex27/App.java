package ex27;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class App {

    //checks that each string submitted is possible. Otherwise, says it found no errors.
    static void validateInput(String first, String last, String zip, String empID) {
        if (first.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
        }
        if (first.length() == 0) {
            System.out.println("The first name must be filled in.");
        }
        if (last.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
        }
        if (last.length() == 0) {
            System.out.println("The last name must be filled in.");
        }
        if (! zip.matches("[0-9]{5}")) {
            System.out.println("The zipcode must be a 5-digit number.");
        }
        if (! empID.matches("[A-Z]{2}[-][1-9]{4}")) {
            System.out.println("The employee ID must be in the format AA-1234.");
        }
        else {
            System.out.println("There were no errors found.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = input.next();
        System.out.print("Enter the last name: ");
        String lastName = input.next();
        System.out.print("Enter the ZIP code: ");
        String zipCode = input.next();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.next();

        //because the printing is done in the method, I don't need to print anymore in main.
        validateInput(firstName, lastName, zipCode, employeeID);

    }
}
