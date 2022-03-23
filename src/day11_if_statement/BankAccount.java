package day11_if_statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
//        /*
//            Create a double value for the account balance.
//    Create a double value for how much you want to withdraw
//
//    Check the balance after the withdraw
//        if you tried to withdraw more money that you had in the account
//        add a negative overdraft fee to the balance
//
//    In both cases print the remaining balance after withdrawing,
//    with overdraft free applied if you went over
//         */
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("Put your current balance ! ");
////        double balance = input.nextDouble();
////        System.out.println("Put your withdrawal amount ! ");
////        double withdraw = input.nextDouble();
////
////
//////        double balance = 500;  // hard coded
//////        double withdraw = 1000;  // Hard coded
////
////        double balanceAftrWithdrwl = (balance - withdraw);
////
////        if (balanceAftrWithdrwl < balance) {
////            System.out.println("\nYou have a Negative balance $: "
////                    + (balanceAftrWithdrwl - balance)); }
////        else {
////            System.out.println("\nYou are in good state");}
////
////
//
//        ////////////another way //////////
//
////
////        double balance1 = 200;  // hard coded
////        double withdraw1 = 1000;  // Hard coded
////
////        balance1 -= withdraw1;
////
////        if (balance1 < 0) {
////            System.out.println("\nTook out too much money" +
////                    ", $100 overdraft is applied");
////            System.out.println("So the balance before the fee was $" + balance1);
//////            balance1 -= 100; // balance = balance -100;}
////
////            System.out.println("\nNow the final balance is $" + balance1);
//        }

        ///////////////using Dynamic Scanner values from the console /////////

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Put your balance now :");
        double balance2= keyboard.nextDouble();
        System.out.println("PUt your withdrawal amount : ");
        double withdrawal2 = keyboard.nextDouble();

        balance2-=withdrawal2;  // balance= balance - withdrawal

        if ( balance2>withdrawal2){ System.out.println("You are great and " +
                "your balance is "+(balance2));}

        else if ( balance2 <0) {
            System.out.println("You have a Negative value, you will be charged for the Overdraft");
            System.out.println("Your current balance is : " + balance2);
            balance2 -= 100;
        }
        System.out.println("Your final balance is :" + balance2);


    }
}