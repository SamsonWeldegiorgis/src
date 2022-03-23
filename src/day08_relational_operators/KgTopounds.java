package day08_relational_operators;

import java.util.Scanner;

public class KgTopounds {
    public static void main(String[] args) {

        /*
         create a class called KgTopounds, and write a program
         that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds
         */

//        int kg = 10;
//        double pound = 2.20462;
//
//        System.out.println(" \nEnter a number of kilogram:" ) ;
//        System.out.println(" \nThe " + kg + "kg in "+ pound+" pound is: "+(kg*pound));

//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println(" \nEnter a kilogram and pound respectively :" ) ;
//        int kg1= input.nextInt();
//        double pound1 = input.nextDouble();
//
//        System.out.println(" \nThe " + kg1 + "kg in "+ pound1+" pound is: "+(kg1*pound1));


        System.out.println("  ---------------------------------");

       /*  create a class called GalonsToLiters, and write a program that can convert the gallons to litters
                Ex:
        gallon = 10;
        output:
        10 gallons equal to 37.8541 liters
                gallon = 20
        output:
        20 gallons equal to 75.7082 liters

        */

        System.out.println("  ---------------------------------");

        System.out.println(" Enter the galons figure please :");
//        int galons = 10;
//        System.out.println(" The liter of "+ galons+ "gallons is:"+ (galons*3.78541));

        Scanner input = new Scanner(System.in);

        int galons1 = input.nextInt();
        System.out.println(" The liter of "+ galons1+ " gallons is:"+ (galons1*3.78541));




    }
}
