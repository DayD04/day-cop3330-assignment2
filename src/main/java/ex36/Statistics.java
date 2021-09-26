package ex36;
import java.util.Scanner;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class Statistics {

    static int max(ArrayList<Integer> list) {
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i > a) {
                a = list.get(i);
            }
        }
        return a;
    }

    static int min(ArrayList<Integer> list) {
        int a = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (i < a) {
                a = list.get(i);
            }
        }
        return a;
    }

    static double average(ArrayList<Integer> list) {
        double a = 0;
        for (Integer integer : list) {
            a = a + integer;
        }
        a = a / list.size();
        return a;
    }

    static double std(ArrayList<Integer> list) {
        double a = 0;
        for (int i = 0; i < list.size(); i++) {
            double b = average(list);
            b = list.get(i) - b;
            b = Math.pow(b, 2);
            a = a + b;
        }
        a = a / list.size();
        a = Math.sqrt(a);

        return a;
    }

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number: ");
            String num = input.next();

            if (num.equals("done")) {
                break;
            }

            int ber = Integer.parseInt(num);
            numbers.add(ber);
        }
        System.out.print("Numbers: ");
        System.out.println(numbers);
        System.out.println("The average is " + average(numbers));
        System.out.println("The minimum is " + min(numbers));
        System.out.println("The maximum is " + max(numbers));
        System.out.println("The standard deviation is " + std(numbers));


    }


}
