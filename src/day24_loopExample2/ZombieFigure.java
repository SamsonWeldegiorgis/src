package day24_loopExample2;

import java.util.Scanner;

public class ZombieFigure {
    public static void main(String[] args) {
       /*
        Day 0 [100]
        Day 1 [50]
        Day 2 [25]
        Day 3 [12]
        Day 4 [6]
        Day 5 [3]
        Day 6 [1]
                ---- EXTINCT ----
        Day 0 [6]   .....6
        Day 1 [3]
        Day 2 [1]
                ---- EXTINCT ----
                */

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        //WRITE YOUR CODE BELOW   // aeiou



        int day=0;
        while (inhabitants > 0){
            System.out.println("Day " + day++ +" [" + inhabitants+ "]");
            inhabitants=inhabitants/2;

        }   System.out.println("---- EXTINCT ----");


        /////////////////other method but not complete,,
//
//        }
//
//        for (int i= 0; i< inhabitants;) {
//          inhabitants-=inhabitants/=2;
//            System.out.println("Day " + i++ + " ["+inhabitants + ']');
//
//            }   System.out.println("---- EXTINCT ----");
    }
}
