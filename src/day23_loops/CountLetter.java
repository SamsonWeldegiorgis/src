package day23_loops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
    /*
    Given a string we want to count how many 'a' characters we have
    challenge : adjust so that we can check for not only 'a' but any character
    ex: aabbcaa
     */
        String word1 = "salamatamatata";
        char letter = 't';
        int count=0;


        for ( int i=0; i<word1.length(); i++){
//
            if (word1.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("Number of the" + letter +" is :" + count);


        System.out.println("another =========================");
//
//        Scanner input = new Scanner(System.in);
//        String str ="aabbcaa";
//        int counter = 0;
//
//        for(int i =0; i < str.length() ; i++ ) {
////            System.out.println(str.charAt(i));  /// aabbcaa ,,,as it is
////            counter+=input.nextInt();
//            if (str.charAt(i) == 'a') { // checks if every character is equal to a
//                counter++;
//
//            }
//        }System.out.println("The numbers are :" + counter);


        System.out.println("another =====================");

//        String word = "ahifaereffe";
//        int count =0;
//
//
//        for ( int i=0; i<word.length(); i++){
//            if (word.charAt(i)=='f'){
//                count++;
//            }
//        }
//        System.out.println("Counter of:" + count +" is" + count);

        ///////////another option


    }
}



