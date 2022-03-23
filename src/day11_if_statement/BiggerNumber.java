package day11_if_statement;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        /*
        Create two number variables
        Find and print which number is bigger between the two
            ex:
            50
            45
                output:
                    50 is bigger
         */

//        int num1 = 105 ;
//        int num2= 105;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPut the first number: ");
        int num1= scan.nextInt();
        System.out.println("Put the second number : ");
        int num2= scan.nextInt();


        if(num1>num2){
            System.out.println(num2+ " is bigger than "+ num1); }
        else if (num1<num2){ System.out.println(num2+" is bigger than "+num1);}
        else System.out.println("Both numbers "+num1+ " and " + num2+ " are equal.");

    }
}
