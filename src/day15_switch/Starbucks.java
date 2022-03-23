package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        /*
            Declare price and calories variables
            ask the user to enter which size drink they want
            Based on
        data :
            size = tall
            price = 2.5
            calories = 100

            size = grande
            price = 4.00
            calories = 150

            size = Venti
            price = 4.50
            calories = 200

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Starbucks.\nWhat size would you like? ");
        String size = scan.nextLine();
        int calorie = 0;
        double price = 0;
        boolean validOrder = true; // by making it true, I pick that all orders are valid
                                // when i have an invalid order I will change the value


        switch(size){
            case "Tall":
                price= (int) 2.5;
                calorie= 100;
                break;
            case "Grande":
                calorie=150;
                price= (int) 4.00;
                break;
            case "Venti":
                calorie=200;
                price= (int) 4.5;
                break;
            default:
                System.out.println( "We don't have "+size+" size");
                validOrder=false;
        }
        if (validOrder) {
        System.out.println(size+" coffee has a price of $" + price
                +" \nand has a calorie of " +calorie);

}}}
