package day24_loopExample2;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        /*
     Multiply End [String, Loops]
     Given a String and a number return a String that has the ending character
     duplicated and attached by the number amount of times

Input:   Hello?  3 		Output: 	Hello????
		 java   5 		Output:     javaaaaaa
         */
        ///////////////////////////////////Better Solution///////////////////////////////////////////

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        System.out.println("How many times do we want to repeat the ending");
        int repeat = input.nextInt();

        for (int i=0; i<repeat; i++){
            word+=word.charAt(word.length()-1);  // last char of a String >> word.lengh()-1   // correct
//            word+=word.substring(word.length()-1);  // last char of a String >> word.lengh()-1
////            word+=word.substring(word.length()-1,word.length());  // last char of a String >> word.lengh()-1
        }
        System.out.println(word);



        //        int n = 0;
//        String str = "hello?";
//        int counter = 0;
//
//        for (int index = 0; index < str.length(); index++) {
//
//
//
//            System.out.print((str.charAt(index)));

    }
}
