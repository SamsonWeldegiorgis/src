package day24_loopExample2;

import java.util.Scanner;

public class SpacerBWords {
    public static void main(String[] args) {

                /*
Space program [String, Loops]
Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
     more words -> m o r e _ w o r d s

         */

                Scanner input = new Scanner(System.in);
             System.out.println("Enter a word");
             String str = input.nextLine().trim();

        for (int i = 0; i < str.length(); i++) {
//
            System.out.print(str.replace(" ", "_").charAt(i)+ " ");
//            System.out.print(str.trim().replace(" ", "_").charAt(i)+ " ");
//
        }
            // space,,,,more words

//////////////////////////////better ways ////////////////////////////////////////////////
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a sentence");
//        String str1 = input.nextLine().trim();
//
//        String fixed="";
//
//        for (int i=0; i<str1.length(); i++){
//            if (str1.charAt(i)==' '){
//                fixed+="_ ";   // there is a space after the underscore ,,
//            }else {
//                fixed+=str1.charAt(i)+ " ";
//            }
//
//
//        }System.out.println(fixed.trim());
//




    }}
