package day18_string_examples;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        /*
        If there is an empty input, do not check anything else and print: "Empty input given"

        	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
Otherwise: "Invalid 5-digit account number"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the 2 Starting 7 digit account number");
        String accountNumber = input.nextLine();

//        if (accountNumber.isEmpty()) {
//            System.out.println("Empty input given");
//        }
//
//        if (accountNumber.startsWith("2") && accountNumber.length() >= 7) { // 2021245412
//            System.out.println("\nValid 7-digit account number");
//        } else {
//            System.out.println("Invalid , put 7-digit account number");
//        }
        {
        if (accountNumber.startsWith("2") || accountNumber.length() > 7){
            System.out.println("VALID 2 digit Starting  ");
        } else if (accountNumber.startsWith("")){
            System.out.println("INVALID 2 digit start");
        }  if (( accountNumber.length()<7) && (accountNumber.startsWith(""))){
            System.out.println("INVALID 7 Character ");
        } if (accountNumber.length() >10){
            System.out.println("VALID 7 characters");
        }

        System.out.println("\nPut the 5 Starting 10 digit account number");
        String accountNumber2 = input.nextLine();

        {
            if (accountNumber2.startsWith("5") || accountNumber2.length() > 10 )
                    {
                System.out.println("VALID 5 digit starting ");  // 501545484487

            } else
             if (accountNumber2.startsWith("")) {

                System.out.println("Invalid 5 digit starting");

            }  if ((accountNumber2.length() < 10) && (accountNumber2.startsWith("")))  {
                    System.out.println("InvALID 10 characters");
                }if ((accountNumber2.length() > 10) )  {
            System.out.println("VALID 10 characters");
        }
        }}}}


