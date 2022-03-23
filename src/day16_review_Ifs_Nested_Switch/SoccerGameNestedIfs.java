package day16_review_Ifs_Nested_Switch;

import java.util.Scanner;

public class SoccerGameNestedIfs {
    public static void main(String[] args) {
        /*
            /*
    declare and assign a minutes variable
    use the minutes value to determine how much time is left in the soccer game

    use these ranges to determine the outputs:

    - any number less than 0 and more than 90 are not valid:

        when the minutes is less than 0:
            print: minutes cannot be a negative number
        when the minutes is more than 90:
            print: games cannot be longer than 90 minutes

    - when the minutes are between 90 - 75
        print: just getting started

    - when the minutes are between 74 - 60
        print: players are doing their best

    - when the minutes are between 59 - 30
        print: middle of the game is going great

    - when the minutes are between 29 - 0
        print: the end of the same is approaching

     */
        Scanner input = new Scanner(System.in);
        System.out.println("\nHow many minutes are left");
        int minutes = input.nextInt();

        if (minutes<=90 && minutes >=0){                // positive flow

        if (minutes >=75){   //  a range b/n 75-89
            System.out.println("Just getting started");
        } else if (minutes >=60) { //  a range b/n 60-74
            System.out.println("Players are doing their best");
        } else if (minutes >=30) {  //  a range b/n 30-59
            System.out.println("Middle of the game is going great");
        } else if ( minutes >0) { //  a range b/n 1-29
            System.out.println("The end of the game is approaching");
        }

        }else {
//            if (minutes <0){  // negative or false outcome
//            System.out.println("Minutes cannot be a negative number");
//        } else {
//                    System.out.println("Games cannot be longer than 90 minutes");
//                }
            System.out.println(minutes < 0 ? "Minutes canNOT be a negative number" :
                    "Game canNOt be longer than 90 minutes");
            }}}
