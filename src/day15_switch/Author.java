package day15_switch;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {
        /*
        Given the genre name figure out: average page length=500/5, average profit=1M/50,
        average number of sequels=5/50, average number of countries=50/5 published in.
        Find and print the information based on the genre.


         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the genre pls ");
        String genre = input.nextLine();


        int pageLength =0;
        int profit = 0 ;
        int sequel =0;
        int countries = 0;
        boolean isValid = true;



        switch (genre){
            case "Fantasy":
            case "ft":
                pageLength=500;
                profit = 1_000_000;
                sequel= 5;
                countries = 50;
//
            break;

            case "Detective":
            case "dt":
                pageLength=350;
                profit = 700_000;
                sequel= 3;
                countries = 45;
//
            break;
            case "ScienceFiction":
            case "SF":
            case "sf":
                pageLength=720;
                profit = 900_500;
                sequel= 4;
                countries = 30;
//
            break;
            case " ShortStory":
            case "SS":
            case "ss":
                pageLength=150;
                profit = 300_000;
                sequel= 1;
                countries = 40;

                break;

            default:
                System.out.println("Invalid Genre");
                isValid = false;



        } if (isValid)
            System.out.println("Average page length= "+(pageLength/sequel));
            System.out.println("Average profit =  $"+(profit/sequel));
            System.out.println("Average number of sequels= "+((sequel*pageLength)/countries));
            System.out.println("Average number of countries=  "+(countries/sequel));
        }


    }

