package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
       Given a day number, find and print the day related to the number
       1-Monday
       2-Tuesday
       /
       /
      7- Sunday
      any other number : not a day
         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the day number:1-7");
        int number = input.nextInt();
        String day = " ";

        switch (number) {
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Not a valid day number!";

        }  System.out.println("The number "+number+ " is "+day );
    }
}
