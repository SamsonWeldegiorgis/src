package day11_if_statement;

import day07_uniry_operators.SalaryCalculator;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {
        /*
        create an int value for the time of the day. Use a 24 hour format
            use the given time of day to display a message
            hint: use seperate if statements
            if the hours are from 6 - 11, print: Good morning
            if the hours are from 12 - 16, print: Good evening
            if the hours are from 17 - 23, print: Good night
         */

//            int timeOfTheDay = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the hour available :");
        int timeOfTheDay = input.nextInt();

            if (timeOfTheDay>= 6 && timeOfTheDay<=11){
                System.out.println("Good Morning !");
            }
            else if (timeOfTheDay>=12 && timeOfTheDay<=16){
                System.out.println("Good Evening !");
            }
            else if (timeOfTheDay>=17 && timeOfTheDay<=23) {
                System.out.println("Good Night !");
            }else {
                System.out.println("Invalid Number");
            }

    }
}
