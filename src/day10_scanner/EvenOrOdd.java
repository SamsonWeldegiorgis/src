package day10_scanner;

import java.util.Scanner;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
        Ask the user to enter an int number. Determine if the number is even or odd

        Print a boolean for both even and odd

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please: ");

        int number = sc.nextInt();

//        Boolean isEven = number % 2 == 0;
//        Boolean isOdd = number % 2 !=0; // num %2 ==1 ,
//
//        System.out.println("Number " + number+ " is EVEN : " + isEven);
//        System.out.println("Number " + number+ " is ODD : " + isOdd);

        //////////////////using ODD by num %2==1 ---============

        Boolean isEven1 = number % 2 == 0;
        Boolean isOdd1 = number %2 ==1 ;

        System.out.println( number+ " is isEven : " + isEven1);
        System.out.println( number+ " is isOdd  : " + isOdd1);


        ////////////////////OR using IF ////////////////////

//        if ( number %2==0) { System.out.println(number +" is EVEN ");}
//            else {
//                System.out.println(number+ " is ODD");}





    }
}
