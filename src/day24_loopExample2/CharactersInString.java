package day24_loopExample2;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {
        /*
        ex: INput : "java".....output : 106 97 118 97
         */
        Scanner input = new Scanner(System.in);
//        String s = input.nextLine();

        String s = "java";


        for ( int i=0 ; i< s.length()  ; i++){
//            System.out.println("Enter a word");
            System.out.print((int)s.charAt(i)+ " "+"\n");
//
//        }
//
//        for (int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i)+ ": "+(int)s.charAt(i));


        }

    }
}
