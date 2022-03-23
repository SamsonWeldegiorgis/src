package day24_loopExample2;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = input.nextLine().trim();


//        String word= "children";

        String vowels = "";

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels += "" + letter;
                    break;

            }
        }

        System.out.println(vowels);
    }}


//        System.out.println(" -------------------------another way");
////
////        Scanner input = new Scanner(System.in);
//        String word1 = input.nextLine();
//
//        //WRITE YOUR CODE BELOW
//        String vowels1 = "";
//        for (int i=0; i<word1.length() ;i++) {
//
//            if (word1.charAt(i) == 'a' || word1.charAt(i) == 'i'
//                    ||word1.charAt(i) == 'e' ||word1.charAt(i) == 'o'
//                    ||word1.charAt(i)=='u' ) {
//                vowels1+=word1.charAt(i);
//            }
//        } System.out.println(vowels1);
//    }}




