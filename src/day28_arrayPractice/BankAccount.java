package day28_arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
        0- full name   ,,,,, 1- account type .....3- a/n ,,,,,,4- balance
        */

        String[] bankAccountOne = {"Brad Smith", "Checking", "100219482", "100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account type: " + bankAccountOne[1]);
        System.out.println("Account number: " + bankAccountOne[2]);
        System.out.println("Balance: " + bankAccountOne[3]);


        System.out.println(" -----Another way  -------");

        String[] bankAcctounTwo = new String[4];
        System.out.println(Arrays.toString(bankAcctounTwo));
        bankAcctounTwo[0] = "Jammie Fox";
        bankAcctounTwo[1] = "Savings Account";
        bankAcctounTwo[2] = "130484192";
        bankAcctounTwo[3] = "10203324";
//        bankAcctounTwo[20] = ""; out of bounds
        System.out.println(Arrays.toString(bankAcctounTwo));

        System.out.println(" -----Another way  -------");

        String[] bankAccountThree = new String[4]; // must give a size/value
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = input.nextLine();
        bankAccountThree[0] = firstName;
        System.out.println("Enter your account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your accoutn number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = input.nextLine();

        System.out.println(Arrays.toString(bankAccountThree));


        System.out.println(" -----Array wise print -------");//

        String [] bankAccountFour = new String [4];
        String [] questions= {"full name", "account type", " A/c", "your balance"};

          for (int i = 0; i < bankAccountFour.length; i++) {
              System.out.println("Enter your "+ questions[i]);
              bankAccountFour[i]=input.nextLine();
          }
            System.out.print(Arrays.toString(bankAccountFour));





            }


        }


