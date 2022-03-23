package day15_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        /*
        Season Finder

declare and assign a month number. Bases on the below data determine
 what season it is and
 what kind of clothes to wear.
 You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter    // It is winter, so wear a winter coat, gloves and a hat
	3, 4, 5 	--> Spring   // It is winter, so wear a winter coat, gloves and a hat
	6, 7, 8 	--> Summer    // It is winter, so wear a winter coat, gloves and a hat
	9, 10, 11 	--> Fall      // It is winter, so wear a winter coat, gloves and a hat

Ex:
	2
It is winter, so wear a winter coat, gloves and a hat
         */

        Scanner in = new Scanner(System.in);
        System.out.println("\nWhich month are you in ");
        int month = in.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter, so wear a winter coat, gloves and a hat");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is Autumn, so wear a slippers ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is Summer , so wear light clothes ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is Spring, so wear a coats always ");
                break;
            default:
                System.out.println("Invalid Season Number, put another");
                break;
        }



    }
}
