package day10_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        /*
        Ask the user to enter their age (byte),
        ask them to enter their favorite number (long),
        and ask them to enter their favorite book
        Print all the values from the inputs
         */

        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);


        System.out.print("Put your favourite book:");
        String bookName = in.nextLine();
        System.out.print("Put your favourite number:");
        long number = in.nextLong();
        System.out.print("Please enter your age:");
        byte age = in.nextByte();


        System.out.println("Your favourite book is: "+ bookName+" and your favourite number is: "
                        + number+ " and your age is :" +age );


    }
}
