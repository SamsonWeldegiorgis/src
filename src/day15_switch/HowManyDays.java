package day15_switch;

import java.util.Scanner;

public class HowManyDays {
    public static void main(String[] args) {
        /*
        Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Put the month please");
        int month = input.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("It has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("It has 30 days");
                break;
            case 2:
                System.out.println("It has 28 days");
                break;
            default:
                System.out.println("Non month number");
        }
    }
}
