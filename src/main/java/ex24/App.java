package ex24;

import java.util.Arrays;
import java.util.Scanner;

/***
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class App {
    static boolean isAnagram(char[] str1, char[] str2) {
        int word1 = str1.length;
        int word2 = str2.length;

        //checking that both words are the same length.
        if (word1 != word2) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < word1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String first = input.next();
        char[] str1 = first.toCharArray(); //turning the String to a char[]

        System.out.print("Enter the second string: ");
        String second = input.next();
        char[] str2 = second.toCharArray(); //turning the String to a char[]

        if (!isAnagram(str1, str2)) {
            System.out.println(first + " and " + second + " are not anagrams.");
        }
        if (isAnagram(str1, str2)) {
            System.out.println(first + " and " + second + " are anagrams.");
        }
    }

}
