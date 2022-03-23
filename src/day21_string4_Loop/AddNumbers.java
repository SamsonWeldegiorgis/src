package day21_string4_Loop;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        /*
        add numbers <500; :add all the numbers from 1 - 500

        enter number 1> types number : enter number 2> types number

         */
        int number = 1;
        int total = 0;

        while(number<=5){
            System.out.println("Enter number " + number);
            number++;
            total+=input.nextInt(); // sum up the total
        }
        System.out.println("total: "+total);

    }
}
