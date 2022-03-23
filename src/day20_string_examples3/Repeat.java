package day20_string_examples3;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
                /*
Ex:
  Input:
    java   =   jaja

    lighligh    =  lili

         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
//

        System.out.println((word.charAt(0) +""+word.charAt(1)).repeat(2)); // jaja
        System.out.println((word.substring(3)).repeat(2)); // aa
        System.out.println((word.substring(3,word.length()-1)).repeat(2)); //aa



        // or
//        System.out.print((word.charAt(0) +""+word.charAt(1)));
//        System.out.print(word.charAt(0) +""+word.charAt(1));

    }
}
