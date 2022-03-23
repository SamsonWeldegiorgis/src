package day18_string_examples;

import java.util.Locale;
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        /*
        create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters

houses that have a house number starting with the numbers 500
are on the right side of the street while the address that start with the number
600 are on the left side of the street

			500312 ROAD W DRIVE, 98404
			house on the right side
            house on drive

            			600134 SOUTH LANE, 500415
			            house on the right side
                        house on drive
                        			            drive: house on drive
			                                    lane: house on lane
                                                ave: house on avenue
         */
        Scanner input = new Scanner(System.in);
        System.out.println("\nPut your address");
        String address = input.nextLine();
//        String address = 600312 road w ave, 98404;
//        String address = 500312 ROAD W lane, 98404;
//        String address = 700312 ROAD W drive, 98404;
        String addressPrint = "";


       if (address.startsWith("500")) {
           System.out.println("\n"+ address.toUpperCase());
           System.out.println("house on the right side");
       } else if (address.startsWith("600")) {
           System.out.println("\n"+ address.toUpperCase());
           System.out.println("house on the left side");

       }else if (address.startsWith("")){
           System.out.println("Not valid address! ");
       }
            if(address.contains("600") || address.contains("500")) {

           if (address.contains("drive")){
               System.out.println("house on drive");
           }else if (address.contains("lane")){
               System.out.println("house on lane");
           }else if (address.contains("ave")){
               System.out.println("house on avenue");
           }else {
               System.out.println("Not valid address! ");
           }
    }}}


