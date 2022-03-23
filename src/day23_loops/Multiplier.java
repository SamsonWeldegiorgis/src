package day23_loops;

import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
     /*    4
        4 x 1 = 4
        4 x 2 = 8
            ..
        4 x 10 = 40
                */

        Scanner input = new Scanner(System.in);
//        int number=4;
//
//       for (int s=1 ; s<=10; s++){
//           System.out.println(number+ " x " +s + " = " + (number*s));
//       }



       int fun =7;
        for (int j = 1; j <=10; j++){

            System.out.println("Pdct is "+fun + " x " + j+ "=" + (fun*j));
        }

    }
}
