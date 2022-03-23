package day21_string4_Loop;

import java.util.Scanner;

public class Atm_Login {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
        System.out.println("welcome to ATM");

        int validPin = 1234;
        int userNumber = 0;
        int attempts= 0;

        do {
            System.out.println("Enter the pin");
            userNumber = input.nextInt();
            attempts++;

        } while (attempts <= 3 && userNumber != validPin) ;{

                if (userNumber == validPin) {
                    System.out.println("LOgged in");
                } else {
                    System.out.println("LOGed out");
                }
            }}}


