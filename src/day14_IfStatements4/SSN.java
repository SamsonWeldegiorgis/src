package day14_IfStatements4;

import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {
        /*
        declare and assign a digit pin code
        declare and assign the last 4 digits of ssn: 1234

        delare and assign expected values for both
            example expected :
                pin : 1552
                pin : 1234
         Outputs :
            when the pincode and ssn match the expected print:
                Authentication successful

            when the pincode or ssn are not correct print :
                Authentication failed

            When the pincode was not correct print :
                Invalid
         */


        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter Pin Code please : ");
        int pinCode = in.nextInt();
        System.out.println("Enter last digit of your SSN :");
        int lastSsnNumber = in .nextInt();

//        int pinCode = 1010;
//        int lastSsnNumber = 1034;

        if (pinCode == 4156 && lastSsnNumber == 1234) {
            System.out.println("Authentication Successfull");
        } else {
            if (pinCode != lastSsnNumber) {
                System.out.println("Authentication Failed");
            }  if (pinCode != 4156 || lastSsnNumber == 1234) {
                System.out.println("Incorrect Pin");
            }  if (pinCode == 4156 || lastSsnNumber != 1234) {
                System.out.println("Incorrect SSN");
            }   if (pinCode != 4156 && lastSsnNumber ==1234) {
                System.out.println("Put valid Pin");
            }  if (pinCode==4156 && lastSsnNumber !=1234){
                System.out.println("Put correct SSN please ");
            }  else if ( pinCode !=4156 && lastSsnNumber !=1234) {
                System.out.println("Put valid Pin code & Correct SSN");
            }
        }

        ///////////////another wasy ! ///////////////////

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your pincode: ");
//        int actualPin = input.nextInt();
//        System.out.println("Please enter the last 4 digits of your ssn");
//        int actualSSN = input.nextInt();
//
//        int expectedPin = 1552;
//        int expectedSSN = 1234;
//
//        if(actualPin == expectedPin && actualSSN == expectedSSN){
//            System.out.println("Authentication successful");
//        } else {
//
//            System.out.println("Authentication failed");
//
//            if(actualPin != expectedPin){
//                System.out.println("incorrect pin code");
//            }
//
//            if(actualSSN != expectedSSN){
//                System.out.println("incorrect ssn");
//            }
//
//        }

        ///////////////another way ! ///////////////////

//
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("Please enter your pincode: ");
//        int actualPin1 = input.nextInt();
//        System.out.println("Please enter the last 4 digits of your ssn");
//        int actualSSN1 = input.nextInt();
//
//
//
//        int expectedPin1 = 1552;
//        int expectedSSN1 = 1234;
//        boolean validPin = actualPin1 == expectedPin1;
//        boolean validSSN = actualSSN == expectedSSN1;
//
//        if(validPin && validSSN){
//            System.out.println("Authentication successful");
//        } else {
//
//            System.out.println("Authentication failed");
//
//            if(validPin != validPin){
//                System.out.println("incorrect pin code");
//            }


            // valid pin: true -> !true -> false
            // ssn wrong: false -> !false -> true
//
        }
    }

