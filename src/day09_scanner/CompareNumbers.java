package day09_scanner;

import day03_comments_sequence_escape.EscapeSequence1;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        /*
        Create a Scanner object
            as the user to enter 2 numbers
            check if the numbers are equal to each other

         */

        System.out.println(" Put a first number : ");
         Scanner input = new Scanner(System.in);
         int number1 = input.nextInt();
        System.out.println(" Put a second number : ");
        int number2 = input.nextInt();
        System.out.println(" \nBoth "+ number1+" and " +number2+ " are equal : " + (number1==number2));


    }
}
