package day15_switch;

import java.time.MonthDay;
import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        /*
        Task :
            Ask the user to enter which day it is  :
            Print which class we have on that day, and the time of the class
            show if there is office hours

                ex : friday - off
                    Thur - soft skill
                    Sunday - long class day
                    Monday - President's day
                    Tue - Saim's class
                    Wed - Quiz final day
                    Sat - Another long class day
                    other numbers - NOt valid number

                    challenge(1) :
                        - monday, Monday, mon,,,,,
                        - Reduce repeating code
         */

        Scanner in = new Scanner(System.in);
        System.out.println("\nPut the day's  please :");
        String scheduleDay = in.nextLine();
        String day = "";
        boolean validOrder = true;

        switch (scheduleDay) {
            case "Monday":
            case "monday":
            case "Mon":
                day = "Monday -President's day";
                break;
            case "Tuesday":
            case "Tues":
            case "tuesday":
                day = " Saim's class";
                break;
            case "Wednesday":
            case "Wed":
            case "wednesday":
                day = "Quiz final day";
                break;
            case "Thursday":
            case "Thur":
            case "thursday":
                day = "soft skill";
                break;
            case "Friday":
            case "Fri":
            case "friday":
                day = "Off the day";
                break;
            case "Saturday":
            case "Sat":
            case "saturday":
            case "Sunday":
            case "Sun":
            case "sunday":
                day = "long class days";
                break;
            default:
                System.out.println( "Invalid day number");
                validOrder=false;

        }   if (validOrder) {
            System.out.println("On "+scheduleDay+" we have: "+day);
        }}}

