package day10_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        /*
        Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )

        Determine if the angles make a triangle, which means the angles add to 180.0
        and determine if the angles make a circle, which means the angles add to 360.0
            */

        Scanner keyboard = new Scanner(System.in);

//        System.out.println("\nEnter 3 angle numbers");
//        double angleOne = keyboard.nextDouble();
//        double angleTwo  = keyboard.nextDouble();
//        double anleThree = keyboard.nextDouble();
//
//        boolean isTriangle = angleOne+angleTwo+anleThree == 180;
//        boolean isCircle = angleOne+angleTwo+anleThree == 360;
//
//        System.out.println("isCircle, their total is "+(angleOne+angleTwo+anleThree) +" which is " +isCircle);
//        System.out.println("isTriangle, their total is " +(angleOne+angleTwo+anleThree) + " which is " + isTriangle);

        ///////////////////corrections ///////////////////

        System.out.println("\nEnter 3 angle numbers");
        double angleOne = keyboard.nextDouble();
        double angleTwo  = keyboard.nextDouble();
        double anleThree = keyboard.nextDouble();

        double sum = angleOne+angleTwo+anleThree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum  == 360;

        System.out.println("isCircle, their total is "+(angleOne+angleTwo+anleThree) +" which is " +isCircle);
        System.out.println("isTriangle, their total is " +(angleOne+angleTwo+anleThree) + " which is " + isTriangle);

    }
}
