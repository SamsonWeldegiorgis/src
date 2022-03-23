package day14_IfStatements4;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to ATM ***\nPlease enter your pincode");
        int pinCode = input.nextInt();

        int expectedPin = 2342;

        if (pinCode == expectedPin) {
            System.out.println("Logged in");
            System.out.println("Select a number");
            System.out.println("1)Check Balance");
            System.out.println("2)WIthdrawal");
            System.out.println("3)Deposit");
            int option = input.nextInt();
//            double balance = 1_000_000;


            if (option ==1){
//                int money= input.nextInt();
               System.out.println("Your balance is : $" + 1_000_000);
            } else if (option==2){
                System.out.println("How much do you want to withdraw");
                double money = input.nextInt();
//                System.out.println("Withdrawing $"+withdrawal);
//                balance-=withdrawal;
                System.out.println("Balance is $:" + money);

            }else if (option==3){
                System.out.println("Please deposit the money");
                double depositAmount = input.nextInt();
                System.out.println("Balance is $:" +(1_000_000-depositAmount));
                } else {
                System.out.println("Invalid selection: Exing account ");
            }
        } else {
            System.out.println("Invalid pin. Please try again!");
    }

}}
