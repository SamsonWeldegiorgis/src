package day26_nested_loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

//        // separate hard coded loops
//        for (int i=1; i <=10; i++ ) {
//            System.out.println(1 + " x " + i + " = " + (i * i));
//        }
//
//            for (int i=1 ; i<=10 ; i++){
//                System.out.println(2+ " x " +i+ " = "+(2*i));
//            }


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a first number");
//        int num = input.nextInt();
//        System.out.println("Enter a second number");
//        int multi = input.nextInt();

            // nested loop
        for( int num=1; num<=5; num++){
            for( int multi=1 ; multi <=7 ; multi++){

                System.out.print(num + " x " + multi + " = " + (num * multi)+ " | ");
            }
            System.out.println();
        }
        }
    }



