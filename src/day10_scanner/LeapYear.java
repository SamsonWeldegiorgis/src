package day10_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
        create a class LeapYear
        create a main method
        create a Scanner object

        Ask the user to enter a year.
        Determine if the year is a leap year or not.
        You can assume a leap year is a year that is divisible by 4.
        Print true or false.

        Hint: use remainder operator
         */

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter the year please :");
        int year = keyboard.nextInt();

        boolean isLeapYear = year % 4==0 || (year % 100 == 0  && year % 400 !=0 );


        System.out.println("This isLeap year is :"+isLeapYear+" because the divisibilty of the year " + year+ " is "+ (year %4));


    }
}
