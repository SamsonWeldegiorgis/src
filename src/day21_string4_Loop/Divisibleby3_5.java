package day21_string4_Loop;

import java.util.Scanner;

public class Divisibleby3_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("put 3 numbers");



   int num =1;
        while (num ++ <= 3){
            System.out.println("Put figures");
             num = input.nextInt();
            if ( num % 5 ==0 ){
                System.out.println( "Fuzz");
            } else if (num % 2 == 0){
                System.out.println("Buzz");
            }  if ( num %3 ==0 && num % 5 == 0){
                System.out.println("FuzzBuzz");
            }
        }}
    }

