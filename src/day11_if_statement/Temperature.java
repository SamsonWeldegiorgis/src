package day11_if_statement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        /*
        Task: ask the user to enter the temperature
        if the temperature is above or equal to 70, It's a nice day
                                                    Print : Go outside ,but with you laptop to code Java
        if the temperature is less 70, print It's too cold
                                   print : Code more Java
         */


        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the temperature");
        int temp = input.nextInt(); // SCANNER VERSION get dynamic values from the console

//        int temp =50; // another way !/////////////////HARD CODED VERSION


        if (temp >= 70) { System.out.println(" It is a nice day !");
            System.out.println(" Go outside, but with your laptop to code Java!");
        } else {
            System.out.println("It is too cold");
            System.out.println("Code more Java!");
        }

    }
}
