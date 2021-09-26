package ex37;
import java.util.Scanner;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */


public class PasswordGenerator {

    private static char[] generatePassword(int length, int num, int spc) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*?";
        String numbers = "0123456789";
        Random random = new Random();

        char[] password = new char[length];

        for (int l = 0; l < length; l++) {
            password[l] = letters.charAt(random.nextInt(letters.length()));
        }

        for (int i = 0; i < length; i++) {
            if (num > 0) {
                for (int j = 0; j < num; j++) {
                    int ran = (int)(Math.random() * length);
                    for (int r = 0; r < special.length(); r++) {
                        if (password[ran] == special.charAt(r)) {
                            ran = ran + 1;
                            if (ran > length) {
                                ran = 0;
                            }
                        }
                    }
                    password[ran] = numbers.charAt(random.nextInt(numbers.length()));
                }
                num = 0;
            }
            if (spc > 0) {
                for (int x = 0; x < spc; x++) {
                    int ran = (int)(Math.random() * length);
                    for (int r = 0; r < numbers.length(); r++) {
                        if (password[ran] == numbers.charAt(r)) {
                            ran = ran + 1;
                            if (ran > length) {
                                ran = 0;
                            }
                        }
                    }
                    password[ran] = special.charAt(random.nextInt(special.length()));
                }
            }
            spc = 0;
        }

        return password;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = input.nextInt();
        System.out.print("How many special characters? ");
        int spec = input.nextInt();
        System.out.print("how many numbers? ");
        int numb = input.nextInt();

        char[] pass = generatePassword(length, numb, spec);
        System.out.print("Your password is ");
        for (char c : pass) {
            System.out.print(c);
        }



    }


}
