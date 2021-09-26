package ex34;
import java.util.Scanner;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Day
 */

public class EmployeeRemoval {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       ArrayList<String> employees = new ArrayList<>();
       employees.add("John Smith");
       employees.add("Jackie Jackson");
       employees.add("Chris Jones");
       employees.add("Amanda Cullen");
       employees.add("Jeremy Goodwin");
       int size = employees.size();

       System.out.println("There are " + size + " employees: " );
       for (String employee : employees) {
           System.out.println(employee);
       }

       System.out.print("Enter an employee name to remove: ");
       String removing = input.nextLine();

       employees.remove(removing);

       size = employees.size();
       System.out.println("There are " + size + " employees:");
       for (String employee : employees) {
           System.out.println(employee);
       }
   }

}
