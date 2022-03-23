package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        /*
            ask the user to enter 5 number and get the biggest and smallest from them
            NB: know the repeated steps ..
                        .. ask for a number, check the biggest,,, check the smallest
         */

        Scanner input = new Scanner(System.in);
        int max = -2147483648;  // default numbers
        int min =  2147483647;  // default numbers

        int n= 0;  // how many times you run them,,,

        while (n<5){
            n++;
            System.out.println("Enter the number");
            int number = input.nextInt();

            if (number>max){  // 5 > 0
                max= number;   // >> 5 is saved

            }
             if (number<min){
                min=number;
            }

        }
        System.out.println("Max: "+ max );
        System.out.println("Min: "+ min );


    }
}
