package day11_if_statement;

import java.util.Scanner;

public class SalesAmount {
    public static void main(String[] args) {
        /*
        create a sales amount variable
        use the sales amount to determine the bonus you get at end of the month
        if your sales amount is less than 10000 you don't get any bonus
        if your sales amount is more than or equal to 10000 and less than
        15000 you get a bonus of 5000
        if your sales amount is more than or equal to 15000 you get a bonus
        of 7000
        print your bonus number
         */

//        int salesAmount = 15500;

        Scanner in = new Scanner(System.in);

        System.out.println("\nPut the amount you got: ");
        int salesAmount = in.nextInt();


        if (salesAmount<10000){
            System.out.println("\nYou don't get any bonus !");
        }
        else if (salesAmount >= 10000 && salesAmount<15000) {
            System.out.println("\nYou got a bonus of 5000 ");
        }
        else if ( salesAmount >=15000) {
            System.out.println("\nYou got a bonus of 7000");
        }
    }
}
