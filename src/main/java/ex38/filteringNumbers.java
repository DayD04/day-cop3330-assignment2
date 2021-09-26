package ex38;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class filteringNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Enter a list of numbers, separated by spaces: ");
        String[] s = input.nextLine().split(" ");
        int[] a = new int[s.length];
        int[] array = new int[s.length / 2];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        for (int l = 0; l < a.length; l++) {
            if (a[l] % 2 == 0) {
                array[l / 2] = a[l];
            }
        }

        System.out.print("The even numbers are ");
        for (int i : array) {
            System.out.print(i + " ");
        }



    }

}
