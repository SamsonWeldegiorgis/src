package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        /*
        Write a program that asks the user to enter a price and quantity
        and then calculate the revenue. revenue = price × quantity.
         */


        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the price of the item:");
        double price = scan.nextDouble();
        System.out.println(" Enter the quantity :");
        int quantity = scan.nextInt();

        // ,,,,,,,,,,we can use double revenue = price * quantity;
        //              then print (revenue )

        System.out.println(" \nThe total revenue is: "+(price*quantity));

//        System.out.println(" \nThe total revenue is: "+(scan.nextDouble() * scan.nextInt()));



        // popular names for Scanner : scan, input, scanner, keyboard


    }
}
