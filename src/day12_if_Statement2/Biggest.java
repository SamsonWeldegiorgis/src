package day12_if_Statement2;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        /*
        declare and assign 3 int variables
        b/n the 3 find the biggest
         */

//        int first = 20 ; // scanner
//        int second = 200 ;
//        int third = 25 ;
//        int biggest;


//        biggest = first;
//        if(second > biggest) {
//            System.out.println(second+" is the biggest");
//        }else if ( third > biggest){
//            System.out.println(third+ " is the biggest");
//        }else {
//            System.out.println(first+ " is biggest");
//        }


        ///////////////////CORRECTIONS OF SAIM ///////////

//        int num1 = 4;
//        int num2 = 1;
//        int num3 = 10;


        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the first number ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number ");
        int num2 = scan.nextInt();
        System.out.println("\nEnter the first number ");
        int num3 = scan.nextInt();

        if (num1> num2 && num1 >num3){
            System.out.println(num1 + " is the biggest");
        }else if (num2>num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest");
        }else {
            System.out.println(num3+ " is the biggest");
        }
    }
}
